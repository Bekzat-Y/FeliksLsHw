import java.util.Scanner;

public class DublicateDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String result = str.replaceAll("(.)(?=.*\\1)", "");
        System.out.println(result);
    }
}