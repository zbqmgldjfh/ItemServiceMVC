# ItemServiceMVC
MVC핵심 이론을 배운후 만들어본 프로젝트



## 요구사항 분석

상품을 관리하는 기본적인 CRUD 서비스를 만들어 보았습니다.

이론 공부후 처음 스스로 만들어본 구현이라 시간이 쫌 걸렸습니다. 

​    

**상품 도메인 모델**

- 상품 ID 

- 상품명 

- 가격 

- 수량

​    

**상품 관리 기능**

- 상품 목록 

- 상품 상세 (read)

- 상품 등록 (create)
- 상품 수정 (update)

- 상품 삭제 (delete)

​    

**서비스 로직**

![서비스 로직](https://user-images.githubusercontent.com/60593969/138592820-58ec1029-8733-4dde-88c6-e1fd348e8f6e.png)

기본적인 서비스의 흐름에 대한 로직을 그림으로 표현했습니다.

​    

1) 상품을 등록하는 경우

   상품이 등록하기위해 저장하는 컨트롤러를 호출하여 저장한 후, 상세페이지로 이동하게 됩니다.

   여기서 단순하게 새로운 view로 이동하는것이 아니라, PRG(post, redirect, get)방식을 적용하여, 저장후 새로고침을 하여도 중복 삼품이 계속 증가되며 저장하는 일을 막았습니다.

​    

2. 상품 삭제

   삭제의 경우 삭제 확인 페이지를 만들었습니다.

   확인페이지 에서 확인을 누를경우에만 삭제가 진행됩니다.

   삭제 완료후 상품목록으로 redirect 됩니다.

​    

BasicItemController class 안에 컨트롤러들을 전부 구현하였습니다.

@RequestMapping("/basic/items") 를 이용한 item들에 대한 CRUD가 이루어지기 때문에 공통된 경로를 이용할수 있었습니다.

​    

롬복을 사용하여 좀더 깔끔한 코드를 구현하려 하였습니다.



상품 목록 페이지를 먼저 살펴봅시다.

![상품 목록](https://user-images.githubusercontent.com/60593969/138593582-c8a1d02f-4d3c-4063-8832-a0253457ccb3.png)

이후 목록페이지에서 상품 등록 버튼을 누르면 하단의 등록 폼 으로 이동하게 됩니다.

![상품등록](https://user-images.githubusercontent.com/60593969/138593623-05e23fb3-7b76-489e-af58-cd22bbc8523c.png)

원하는 정보를 입력후 상품 등록 버튼을 누르면 저장완료가 나오는것을 확인할수 있습니다.

![저장완료](https://user-images.githubusercontent.com/60593969/138593638-fdda1e18-7d42-4f63-8191-398487a4303c.png)

이후 다시 삭제를 위해서도 상세 폼으로 올수 있습니다.

![상품 삭제](https://user-images.githubusercontent.com/60593969/138593659-98204186-f63f-410c-90fd-54de0ea1a3e9.png)

위의 상세 폼에서 삭제 버튼을 누르면 다음 확인 화면으로 이동합니다.

![삭제확인](https://user-images.githubusercontent.com/60593969/138593721-c0895a07-93c5-44bc-8ee9-51825ad512e4.png)

이후 삭제하기를 누른다면 삭제가 완료됩니다. 다음과 같습니다.

![삭제완료](https://user-images.githubusercontent.com/60593969/138593719-1ee7cce3-c2e9-46cf-a139-fa749bc155a8.png)
