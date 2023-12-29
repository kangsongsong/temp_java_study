package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {

        StudentType songyi = new StudentType();
        songyi.name = "강송이";
        songyi.studentYear = 1;
        songyi.address = "부산 동래구";

        System.out.println("이름: " + songyi.name);
        System.out.println("학년: " + songyi.studentYear + "학년");
        System.out.println("주소: " + songyi.address);

        int a = 10;
        double b = a;

        Person p = songyi;
        StudentType songyi2 = (StudentType) p;

        // Person 전주환 = new Person();
        // StudentType 전주환학생 = (StudentType) 전주환; -> 불가능

        StudentType 전주환학생 = new StudentType();
        Person 전주환사람 = 전주환학생;
        StudentType 전주환학생2 = (StudentType) 전주환사람;


    }
}
