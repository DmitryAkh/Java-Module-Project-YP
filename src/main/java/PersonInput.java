import java.util.Scanner;

public class PersonInput {
    static Scanner scanner = new Scanner(System.in);
    static  int persons;

     static void personRequest() {
        while (true) {
            System.out.println("Введите количество персон: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка ввода. Введите число.");
                scanner.next();
            }
            persons = scanner.nextInt();

            if (persons >= 2) {
                break;
            } else {
                System.out.println("Некорректное значение, повторите ввод");
            }
        }
        System.out.println("Количество персон: " + persons);
    }
}
