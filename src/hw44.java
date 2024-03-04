import java.util.Scanner;

public class hw44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tv = {"bt1", "bt2", "bt3", "bt4", "bt5"};
        boolean sorted = false;

        while (!sorted) {
            System.out.print("Введите номер канала: ");
            int num = scanner.nextInt();

            if (num >= 1 & num <= 5) {
                num = num - 1;
                System.out.println(tv[num]);

            } else if (num == 0) {
                System.out.println("Выход");
                sorted = true;

            } else {
                System.out.println("Ошибка");
            }
        }
    }
}
