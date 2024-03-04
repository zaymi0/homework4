import java.util.Scanner;

public class hw42 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        boolean sorted = false;
        String str1 = "Exit";

        while (!sorted) {
            System.out.print("Please enter something ");
            str = scanner.nextLine();
            sorted = str1.equalsIgnoreCase(str);
        }
    }
}
