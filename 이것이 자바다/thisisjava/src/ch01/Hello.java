package ch01;

/**
 * @author 여러분의 이름
 */
/*
장제목 : 1장 자바 시작하기
작성일 : 2022.12.01
 */

public class Hello  { // 클래스 선언, Hello -> 클래스명=소스파일명 -> Hello.java
    // {} 클래스블록 , 프로그램 실행 진입점
    public static void main(String[] args){ // main() 메소드 선언 -> 메소드명 / main() 메소드를 프로그램 실행 진입점(Entry Point)라고 부름
        //{} 메소드블록
        System.out.println("Hello, Java");
        // 실행문 끝에는 반드시 세미콜론(;)을 작성
    }
}


/*
    주석
    행 주석 : //
    범위 주석 : /* ... *\/                <= \ 실제로는 제거해야 됨
    도큐먼트 주석 : /** ... *\/            <= \ 실제로는 제거해야 됨

    도큐먼트 주석 - javadoc 명령어로 API 도큐먼트를 생성하는데 사용
*/