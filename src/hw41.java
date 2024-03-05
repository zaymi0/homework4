import java.util.Scanner;

public class hw41 {
    public static void main(String[] args) {
        System.out.print("Please enter your score: ");
        Scanner score = new Scanner(System.in);
        boolean sorted = true;

        do {

            int num = score.nextInt();

            if (num >= 70 & num <= 100) {
                System.out.println("Congrats! You’ve passed the test!");

            } else if (num < 70 & num >= 0) {
                System.out.print("Sorry, you’ve failed the test.");

            } else {
                System.out.print("Error. Enter a value between 0 and 100. ");
                sorted = false;
            }
        } while (!sorted);
    }
}
