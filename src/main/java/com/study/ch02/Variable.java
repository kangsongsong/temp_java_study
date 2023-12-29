package com.study.ch02;

public class Variable {

    public static void main(String[] args) {
        // 리터럴 상수
        // int date; -> 선언
        // date = 10 -> 대입
        // date의 값 -> 1
        // int a = 10;
        // int p = &a
        // *b -> 20
        // 주소를 담을 수 있는 변수 = 포인터 변수 * -> c언어에서 쓰는 거

        int date = 20231230;
        double date2 = (double) date;
        int date3 = (int) date2;
        // int date3 = date2; 불가능 double이 int보다 상위개념
        // 업캐스팅 다운캐스팅
        // 업캐스팅은 형변환 생략 가능 다운캐스팅은 무조건 명시
        // 문자 -> 정수 -> 실수

        char a = '1';
        int b = a;
        double c = b;


        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);
        System.out.println(date + 6);
        System.out.println(date + 7);
        System.out.println(date + 8);
        System.out.println(date + 9);


    }
}
