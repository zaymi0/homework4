import java.util.Scanner;

public class hw43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= Math.abs(x); i++) {
            sum += i;
        }

        if (x < 0) {
            sum = -sum;
        }

        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }
}
