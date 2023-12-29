package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {
        /*
        *
        * 조건연산자(삼항연산자)
        *
        * a > 0 ? "양수" : a == 0 ? "0" : "음수"
        *
        *
        * */

        int iResult = 10 > 2 ? 1111 : 2222; // 결과값의 자료형이 일치해야함
        String sResult = 10 > 2 ? "1111" + 1 : "2222";
        Boolean bResult = 10 > 2;

        String name = null;
        System.out.println(name == null);

        String name1 = "김준일";
        String name2 = new String("김준일");
        System.out.println(name1);
        System.out.println(name2);


    }
}
