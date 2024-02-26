# HappyRoad_RealProject
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/b0a4bd34-cbad-4d93-8f19-cfccd38a5dbb" align="center" width="700" height="530"/>

## 발표 자료
[Happy_Road Project.pdf](https://github.com/Sangwonsdsd/HappyRoad_RealProject/files/14340389/Happy_Road.Project.pdf)

## 팀원
| 이름 | 포지션 | Contact |
| --- | --- | --- |
| 권두원 | CA |  |
| 임도현 | IM | gusehdla@naver.com |
| 최상원 | GM |  |
| 박준 | SM |  |
| 김효주 | DM |  |
  
## 소개
* 고객 맞춤 여행지 추천과 이벤트 정보 제공을 통한 사용자의 국내 여행 계획에 도움을 제공합니다. 

## 설계 목표
1. HTML, CSS, JavaScript, jQuery, Bootstrap(라이브러리)를 이용해서 사용자가 이해하고 이해하기 쉬운 UI 구성
2. JSP & 서블릿(Servlet)과 MyBatis를 이해하고 활용한 게시판 및 홈페이지 구성
3. AJAX를 이용한 테이블(화면전환) 처리
4. 지도 API 활용(KaKao Map)

## 개발환경 & API
* FrontEnd : HTML5, JavaScript, CSS3, jQuery 
* BackEnd : Java, Servlets, MyBatis 
* Library : Kakaomap, JSON In java, Bootstrap, Oracle JDBC Driver 
* IDE : eclipse 
* Server : Tomcat 8.5 
* CI : git, GitHub 
* DataBase : Oracle DB 
* Document : Google Drive, Google Sheets, ERD Cloud, kakao Oven, Kakaotalk, diagrams.net 

## 사진 및 설명
### 메인화면 상단
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/3518ea33-163d-4b5d-914e-4a25c69e0c11" align="center" width="600" height="430"/> 
<br/>
1. ① 로그인 전 -> ⑤ 로그인 후 메뉴 <br/>
2. ② 여행지 검색 기능 <br/>
3. ③ 추천 여행지 <br/>
4. ④ 의 숫자 버튼 하나를 클릭하면 ⑥ 처럼 보여지는 추천 여행지 5곳을 볼 수 있습니다. <br/>
5. ⑦ 자유게시판 페이지 이동(작성, 수정, 삭제 기능 구현) <br/>
6. ⑧ 즐겨찾기 리스트가 비어있다면 빈 하트 이모티콘, 즐겨찾기 페이지(즐겨찾기 리스트 보기, 삭제 기능 구현) <br/>
7. ⑨ 로그아웃, 마이페이지 이동 <br/>

### 메인화면 중단 (카테고리 별 여행지 추천 및 상세 페이지)
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/7e5555bb-95a3-4822-b183-6693f619e92e" align="center" width="600" height="430"/> 
<br/>
1. ① 스크롤 내릴 시 PLACE 카테고리 별 여행지 추천 확인 가능 <br/>
2. ② 도심 관련 여행 추천 상세페이지 이동 <br/>
3. ③ 계절 관련 여행 추천 상세페이지 이동 <br/>
4. ④ 축제 관련 여행 추천 상세페이지 이동 <br/>
5. ⑤ 힐링 관련 여행 추천 상세페이지 이동 <br/>

<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/478ded4b-7415-4694-abb9-ba90c5fa4035" align="center" width="600" height="430"/> 
<br/>
1. ① 스크롤 내릴 시 인기 여행지 확인 가능 <br/>
2. ② 현재 카테고리 페이지(다른 카테고리 클릭 시 해당 카테고리 상세페이지 이동) <br/>
3. ③ 클릭 시 해당 여행지 상세 게시물 이동 <br/>
4. ④ 페이지네이션 버튼 클릭 시 다음 페이지 이동 <br/>
5. ⑤ 클릭 시 추천 여행지 상세 페이지 이동 <br/>


### 메인화면 중단(날짜 별 축제 추천)
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/d02658de-f379-4ff1-b5b1-5e98ece9965a" align="center" width="600" height="430"/> 
<br/>
1. ① 스크롤 내릴 시 EVENT(행사, 축제) 날짜 별 행사 확인 가능 <br/>
2. ② 현재 날짜로 버튼에 색이 들어오고 다른 날짜 클릭 시 해당 날짜 행사 보여주는 기능 <br/>
3. ③ 페이지네이션 버튼 클릭 시 다음 페이지 이동
4. 게시물 클릭 시 해당 게시물 상세 페이지 이동
  
### 메인화면 하단(인기 여행지 TOP3 추천)
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/84b1e427-1c4a-4c37-8858-0625c68510f9" align="center" width="600" height="430"/> 
  <br/>
1. ① 스크롤 내릴 시 HOT NOW는 조회수 순 여행지 TOP 3 확인 가능 <br/>
2. ② 클릭 시 해당 여행지 상세페이지로 이동 <br/>

### 자유게시판
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/24545570-f49a-4e2b-adbf-ce7507019db1" align="center" width="600" height="430"/> 
<br/>
1. ① 게시판 검색 기능(제목, 내용, 작성자 검색 가능) <br/>
2. ② 게시물 상세페이지 이동 <br/>
3. ③ 게시물 작성페이지 이동 <br/>
4. ④ 페이지네이션 기능 <br/>

<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/631c9392-242a-4ba5-8b38-b7b10117c742" align="center" width="600" height="430"/> 
<br/>
1. ①, ② 작성자 경우 게시물 수정, 삭제 기능 <br/>
2. ② 여행지 검색 기능 <br/>
3. ③ 댓글 작성 기능 구현 <br/>
4. ④ 입력창에 댓글을 입력하고 엔터를 누르거나 작성 버튼을 누를 시 댓글 추가 <br/>
5. ⑤ 자유게시판 작성/수정 페이지 <br/>
6. ⑥ 자유게시글 입력창에 제목, 내용을 입력 후 저장 버튼을 누를 시 게시물 추가 <br/>

### 즐겨찾기
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/07460282-29bf-48db-bfaa-899514367d3f" align="center" width="600" height="430"/> 
<br/>
1. ① 즐겨찾기 페이지 <br/>
2. ② 즐겨찾기 여행 게시물 상세페이지 이동 <br/>
3. ③ 즐겨찾기 여행 게시물 삭제 <br/>

### 마이페이지
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/dd4e249e-a9c5-44ee-9105-5df6313a5b7f" align="center" width="600" height="430"/> 
<br/>
1. ① 사용자 정보 변경(바꾸고 싶은 정보 변경 후 정보변경 버튼 클릭) <br/>
2. ② 비밀번호 변경 기능(현재비밀번호 일치 시 비밀번호 변경) <br/>
3. ③ 회원탈퇴 기능(현재 비밀번호 일치 시 회원 탈퇴) <br/>

### 관리자 기능
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/3f90fafc-d366-40df-abb8-97125207988b" align="center" width="600" height="430"/> 
<br/>
1. ① 일반 회원 버튼(일반 회원 상세페이지 이동) <br/>
2. ② 관리자 이모티콘 버튼(관리자 상세페이지 이동) <br/>
3. ③ 일반 회원 마이페이지 상단 버튼 <br/>
4. ④ 관리자 마이페이지 상단 버튼(여행지 추가 페이지 이동) <br/>

<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/2dfad8e6-804d-4c5a-8991-12b0d28a23f2" align="center" width="600" height="430"/>
<br/>
1. ① 여행 게시물 추가(사진 업로드 가능)기능 구현 <br/>

### 검색 기능
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/d7ceff35-c0e2-45bd-af94-a2449370ae26" align="center" width="600" height="430"/> 
<br/>

1. ① ‘꽃’ 검색 시 ‘꽃’에 관련된 여행지 검색 <br/>
2. ② 최신순 or 인기순으로 검색 버튼 <br/>
3. ③ 클릭 시 여행지 상세 페이지 이동 <br/>
4. ④ 의 숫자 버튼 하나를 클릭하면 ⑥ 처럼 보여지는 추천 여행지 5곳을 볼 수 있습니다.
5. ⑦ 자유게시판 페이지 이동(작성, 수정, 삭제 기능 구현)
6. ⑧ 즐겨찾기 리스트가 비어있다면 빈 하트 이모티콘, 즐겨찾기 페이지(즐겨찾기 리스트 보기, 삭제 기능 구현)
7. ⑨ 로그아웃, 마이페이지 이동

### 여행지 상세 페이지
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/34ac4a0a-ed50-450d-9bf5-0b1ba636a684" align="center" width="600" height="430"/> 
<br/>

1. ① 스크롤 내릴 시 후기까지 확인 가능 <br/>
2. ② 클릭 시 즐겨찾기 리스트에 추가(색상 변경), 다시 한번 클릭 시 즐겨찾기 리스트에서 삭제(다시 색상 변경) <br/>
3. ③ 여행 위치를 지도에 표시(카카오 맵 API 활용) <br/>
4. ④ 클릭 시 리뷰 작성 모달 생성 <br/>
5.⑤ 글 작성 후 클릭 시 후기 등록 버튼 <br/>
6. ⑥ 작성된 후기 확인 가능(사용자가 작성한 후기 삭제 가능) <br/>

### ERD 테이블
<img src="https://github.com/Sangwonsdsd/HappyRoad_RealProject/assets/91966029/2daa7759-b779-41c6-afe4-9458ac4aafe5" align="center" width="600" height="430"/> 
