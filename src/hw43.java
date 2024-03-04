import java.util.Scanner;

public class hw43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;
        if (x > 0) {

            for (int i = 0; i <= x; i++) {
                sum += i;
            }

            System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);

        } else {
            for (int i = 0; i <= x * -1; i++) {
                sum += i;
            }

            sum = -sum;
            System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
        }
    }
}
