import java.util.Scanner;

public class hw41 {
    public static void main(String[] args) {
        System.out.print("Please enter your score: ");
        Scanner score = new Scanner(System.in);
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            int num = score.nextInt();
            if (num <= 100) {
                System.out.println("Congrats! You’ve passed the test!");
            } else {
                System.out.print("Sorry, you’ve failed the test. Please enter your score: ");
                sorted = false;

            }
        }
    }
}