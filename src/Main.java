import java.util.Scanner;

public class Main {

    public static class PerimeterCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Запрашиваем количество деталей
            System.out.print("Введите количество деталей: ");
            int numberOfDetails = scanner.nextInt();

            double totalPerimeter = 0;

            // Обходим каждую деталь
            for (int i = 0; i < numberOfDetails; i++) {
                System.out.println("Деталь " + (i + 1) + ":");

                // Вводим размеры детали
                System.out.print("Введите длину (в мм): ");
                double length = scanner.nextDouble();
                System.out.print("Введите ширину (в мм): ");
                double width = scanner.nextDouble();

                // Вычисляем периметр
                double perimeter = 2 * (length + width);
                System.out.println("Периметр детали " + (i + 1) + ": " + perimeter + " мм");

                // Складываем периметры
                totalPerimeter += perimeter;
            }

            // Выводим суммарный периметр и пагонаж
            System.out.println("Общий периметр всех деталей: " + totalPerimeter + " мм");

            // Предположим, что кромочный материал идет длиной 1 м (100 см).
            double edgeMaterialRequirement = totalPerimeter / 100; // в метрах
            System.out.println("Необходимый пагонаж кромочного материала: " + edgeMaterialRequirement + " м");

            scanner.close();
        }
    }
}