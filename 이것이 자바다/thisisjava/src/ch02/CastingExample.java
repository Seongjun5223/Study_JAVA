package ch02;

/**
 * 강제 타입 변환
 *               <-- 강제 타입 변환
 * 작은 허용범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입
 *
 * 큰 허용 범위 타입은 작은 허용 범위 타입으로 자동 타입 변환될 수 없음
 * 큰 허용 범위 타입을 작은 허용 범위 타입으로 쪼개어서 저장하는 것을 강제 타입 변환(casting, 캐스팅)이라 함
 * 강제 타입 변환은 캐스팅 연산자로 괄호()를 사용하는데 괄호 안에 들어가는 타입은 쪼개는 단위
 */

public class CastingExample {
    public static void main(String[] args){
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);
    }
}
