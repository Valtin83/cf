import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerimeterCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Detail> details = new ArrayList<>();

        // Запрашиваем количество деталей
        System.out.print("Введите количество деталей: ");
        int numberOfDetails = scanner.nextInt();

        // Обходим каждую деталь
        for (int i = 0; i < numberOfDetails; i++) {
            System.out.println("Деталь " + (i + 1) + ":");

            // Вводим размеры детали
            System.out.print("Введите длину (в см): ");
            double length = scanner.nextDouble();
            System.out.print("Введите ширину (в см): ");
            double width = scanner.nextDouble();

            // Создаем объект детали и добавляем в список
            Detail detail = new Detail(length, width);
            details.add(detail);
        }

        // Подсчет общего периметра
        double totalPerimeter = 0;
        for (Detail detail : details) {
            double perimeter = detail.calculatePerimeter();
            System.out.println("Периметр детали: " + perimeter + " см");
            totalPerimeter += perimeter;
        }

        // Выводим суммарный периметр и пагонаж
        System.out.println("Общий периметр всех деталей: " + totalPerimeter + " см");
    }
}
