package com.javaex.ex05;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee pt = new Depart( "홍길동", 5000, "개발부" );
        pt.showInformation();
//      pt.super.showInformation(); // 메인에서 super 키워드를 통해 부모 클래스를 불러오지 못함.(아마도 객체 내부에서만 접근 가능) 자바스크립트 에서는 가능.
    }

}


