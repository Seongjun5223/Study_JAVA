package ch02;

/**
 *  27라인처럼 맨 끝에 \ 붙여주면 줄 바꿈하지 않고 다음 줄에 이어서 출력 (JAVA 14부터 제공)
 */

public class TextBlockExample {
    public static void main(String[] args){
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";

        String str2 = """
                {
                    "id" : "winter",
                    "name" : "눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("=================================");
        System.out.println(str2);
        System.out.println("=================================");
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str);
    }
}
