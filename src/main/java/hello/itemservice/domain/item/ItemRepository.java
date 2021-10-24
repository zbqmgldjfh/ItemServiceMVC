package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>();
    private static long sequence = 0L;

    public Item save(Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id){
        return store.get(id);
    }

    public List<Item> findALl(){
        return new ArrayList<>(store.values()); // 실제 store 원본의 값은 변경하지 않기 위해서 감싸서 반환
    }

    public void update(Long itemId, Item updateParam){
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    public boolean delete(Long itemId){
        if(itemId <= sequence){
            store.remove(itemId);
            return true;
        }else return false;
    }

    // test용
    public void clearStore(){
        store.clear();
    }
}
