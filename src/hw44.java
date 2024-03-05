import java.util.Scanner;

public class hw44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tv = {"bt1", "bt2", "bt3", "bt4", "bt5"};
        int num;

        do {
            System.out.print("Введите номер канала: ");
            num = scanner.nextInt();

            if (num >= 1 & num <= 5) {
                System.out.println(tv[num - 1]);

            } else if (num == 0) {
                System.out.println("Выход");

            } else {
                System.out.println("Ошибка");
            }

        } while (num != 0);
    }
}
