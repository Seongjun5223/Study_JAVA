package ch02;

/*
\" : "문자 포함
\' : '문자 포함
\\ : \문자 포함
\ u16진수 : 16진수 유니코드에 해당하는 문자 포함
 */

public class StringExample {
    public static void main(String[] args){
        String name = "홍길동";
        String job = "포로그래머";

        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업";
        System.out.println(str);

        System.out.println("나는\n");
        System.out.println("자바를\n");
        System.out.println("배웁니다.");
    }
}
