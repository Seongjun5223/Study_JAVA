package ch02;

/*
정수 : byte, char, short, int, long
실수 : float, double
논리 : boolean

byte : 1byte, 8bit
short : 2byte, 16bit
char : 2byte, 16bit
int :  4byte, 32bit
long : 8byte, 64bit
 */

public class IntegerLiteralExample {
    public static void main(String[] args){
        int var1 = 0b1011; //2진수
        int var2 = 0206; //8진수
        int var3 = 365; //10진수
        int var4 = 0xB3; //16진수
        int var5 = 011;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);
        System.out.println("var5 : " + var5);
    }
}
