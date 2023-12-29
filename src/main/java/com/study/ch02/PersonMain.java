package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "강송이";
        p.age = 24;

        Person p2 = new Person();
        p2.name = "강송삼";
        p2.age = 25;

        System.out.println("이름: " + p.name);
        System.out.println("나이: " + p.age);

        System.out.println("이름: " + p2.name);
        System.out.println("나이: " + p2.age);

        /*
        이름, 학년, 주소를 저장할 수 있는 StudentType 클래스를 만드시오.
         */


    }
}
