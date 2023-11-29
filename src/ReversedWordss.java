import java.util.Scanner;

public class ReversedWordss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String str = "Hello World";
    StringBuilder sb = new StringBuilder(str);
    sb.reverse();
    String reversed = sb.toString();
        System.out.println(reversed);
    }
}