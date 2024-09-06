public class Main {
    public static void main(String[] args) {

    }
}
// Класс для представления детали
class Detail {
    private double length;
    private double width;

    // Конструктор
    public Detail(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Метод для вычисления периметра
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

