package practice2;

import java.util.Scanner;

public class Program4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Введённое значение не является числом");
            return;
        }
        double a = scanner.nextDouble();
        double result = calculatePowerSum(a);

        System.out.printf("Сумма (A^2+A^4+A^6): %.4f", result);
        scanner.close();

    }

    public static double calculatePowerSum(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a6 = a4 * a2;

        return a2 + a4 + a6;
    }
}