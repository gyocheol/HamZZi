# 햄스터 최대 몇 마리까지 키워봤어!? 소개

---

### 항상 말로만 계획을 세웠던 당신을 위한 현실 기반 계획 설계 서비스

**햄스터 최대 몇마리까지 키워봤어!?** 프로젝트는 Web과 Android 모바일로 제공되는 현실 기반 캐릭터 키우기 어플리케이션입니다. 

주요 기획은 말로만 계획을 세웠던 경험을 바탕으로 어떻게 생활 습관을 계획적으로 지킬 수 있는가에서 시작되었습니다. 

현재 다양한 플래너 서비스가 제공되고 있지만, 사용자가 플래너를 통해 성취감과 재미를 느끼기 어렵다고 생각하여 게임과 현실 기반에 초점을 두었습니다.

그래서 저희는 계획과 퀘스트를 완료하여 사용자를 투영한 햄스터를 성장시키며 성취감과 재미 모두 느낄 수 있는 서비스를 제작하였습니다.

---

# Android 화면

로그인 화면

<img title="" src="https://user-images.githubusercontent.com/96896754/231500425-b785fba6-d5fe-4197-a265-b8cdf4908b52.png" alt="image" width="263">

홈 화면

<img src="https://user-images.githubusercontent.com/96896754/231500345-34aecf94-0106-48d2-9287-301ddb7fb289.png" title="" alt="image" width="263">
<img src="https://user-images.githubusercontent.com/96896754/231500288-c3eef014-279d-40a4-8cd8-f3180ea2e00f.png" title="" alt="image" width="263">
<img src="https://user-images.githubusercontent.com/96896754/231500231-f1473d2f-3b1e-488e-9762-7fe1b2f668bc.png" title="" alt="image" width="263">

TODO 화면

<img src="https://user-images.githubusercontent.com/96896754/231500121-2a318ab8-d495-48b6-801a-67775ce8a059.png" title="" alt="image" width="264">

<img src="https://user-images.githubusercontent.com/96896754/231500053-6127047c-c086-4427-9d7d-2a31a84421e6.png" title="" alt="image" width="262">

QUEST 화면

<img title="" src="https://user-images.githubusercontent.com/96896754/231499982-7259f1b3-beab-4b80-8379-555c46ae5161.png" alt="image" width="263">



### Mobile Descriptino

> 서비스 전체 기능

---

# Web 화면

> 로그인 / 회원가입

![image](https://user-images.githubusercontent.com/96896754/231499584-7c7ccf31-2d1b-4d9d-a820-69c55ec0f5c1.png)

![image](https://user-images.githubusercontent.com/96896754/231499514-011d581d-1e87-4ecd-a81c-a0b71aaab2f5.png)

> 닉네임 / 햄스터 이름 설정

![image](https://user-images.githubusercontent.com/96896754/231499328-38f8a5e8-04d6-484a-9840-d7e7303c456d.png)

![image](https://user-images.githubusercontent.com/96896754/231499263-8ba295af-253a-4526-84a7-82da844a5a8f.png)

> Todo

![image](https://user-images.githubusercontent.com/96896754/231499168-c02e78b4-b8a9-4b8f-86ec-963a30e908a5.png)

> Guild

![image](https://user-images.githubusercontent.com/96896754/231499047-5a2920e8-e0e8-4a28-8862-4318d667967e.png)

> Quest

![image](https://user-images.githubusercontent.com/96896754/231498969-ac0c3cc3-14ef-4d62-97be-cc89a147defa.png)

> Shop

![image](https://user-images.githubusercontent.com/96896754/231498888-ab21844a-81d0-42c2-9517-7821044d548f.png)

![image](https://user-images.githubusercontent.com/96896754/231498811-f195e465-6a98-4916-9f70-bb7eb925a5cf.png)

> 스탯창

![image](https://user-images.githubusercontent.com/96896754/231498716-9c1a3697-8db4-4812-a378-b7dbc1d12e31.png)

### Web Description

> 서비스 전체 기능

- 캐릭터 진화 기능 - 스탯을 찍게 되면 캐릭터의 외향이 변한다. 이때 스탯 가중치에 따라 모습이 바뀐다.
- 캐릭터 졸업 기능 - 캐릭터가 졸업을 하게 되면 My page에서 해당 캐릭터를 볼 수 있게 된다.
- 퀘스트 기능(모바일) - 학교/회사 늦지 않기, 5000보 걷기와 같은 현실 요소가 반영된 퀘스트를 수행할 수 있게 하는 기능
- 투두 기능(웹) - 투두를 등록하고 확인, 체크, 수정, 삭제가 가능. 체크처리가 되면 보상 포인트를 받을 수 있어 성장 또는 shop 이용 가능
- 길드 기능(웹) - 사용자가 길드를 만들거나 가입 가능.
- 퀘스트 기능(웹) - 모바일에서 수행가능한 퀘스트의 설명을 볼 수 있다.
- 상점 기능(웹) - 투두와 퀘스트를 통해 획득한 포인트를 통해 모자, 의류, 장식을 구매할 수 있다. 구매한 아이템은 햄스터가 착용할 수 있다. 한번 구매한 아이템은 햄스터를 새로 생성되도 유지되나 레벨 제한이 있을 수 있다.

# Design

---

## 전체 기술 스택

- android

Android Studio version : Dolphin 2021.3.1

compileSDK : 32

minSDK : 21

targetSDK : 32

Java Version : 1.8

- Web

- Back-End
  
  - 사용한 JVM : Open JDK11
  - 웹서버 : Nginx
  - WAS 제품 : Tomcat
  - IDE 버전 : IntelliJ IDEA 2022.3.1 (Ultimate Edition)

## 전체 시스템 구조

## ERD 다이어그램

![image](https://user-images.githubusercontent.com/96896754/231498463-d60871f1-c4c1-48d2-829a-ab11fa183de7.png)

## 요구사항 명세서

## API 명세서

## Android

|사용한 라이브러리

```jsx
- JetPack

- Coroutine

- ViewModel

- Firebase Cloud Messaging

- NaverMapApi
```

## Web Front-End

|사용한 라이브러리

```jsx
- React v18.2.0

- Node v16.15.0

- npm v8.5.5
```

## Back-End

|사용한 라이브러리

```jsx
- Java OpenJDK 11

- SpringBoot v2.7.7

- EC2 Ubuntu 20.04 LTS (GNU/Linux 5.4.0-1018-aws x86_64)

- NginX v1.18.0

- Docker v23.0.1

- MySQL v10.3.37
```

---

# Team Member

> Android Part

## 팀원 - AOS

**김지훈**

- 역할
  
    퀘스트 로직 설계
  
    진화 로직 설계
  
    회원정보 로직 설계

**고청천**

- 역할
  
    로그인 기능 구현
  
    Todo 로직 설계
  
    졸업 로직 설계

> Front-End Part

## 팀원 - WEB FE

**이종길**

- 역할
  
    Todo 로직 설계
  
    Quest 로직 설계

**이진성**

- 역할
  
    Guild 회원 관리
  
    Shop 로직 설계

> Back-End Part

## 팀원 - BE

**전은수**

- REST API 개발
- 디자인

**강교철**

- 서버 구축 및 배포
- REST API 개발
