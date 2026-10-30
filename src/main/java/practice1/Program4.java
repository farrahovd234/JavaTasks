// Задание №4, выполнил на примере функции
// активации Сигмоида
package practice1;

import java.util.Scanner;

public class Program4_1 {
    public static void main(String[] args) {
        System.out.print("""
                Программа расчёта функции активации сигмоида.
                Эта программа моделирует финальный этап бинарной классификации.
                Она преобразует входной значение нейрона в вероятность от 0.0 до 1.0.
                =====================================================================
                
                Введите значение x(сырой выход нейрона) в диапазоне от -20 до 20: """);

        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextDouble()) {
            System.err.println("Ошибка! Введённое значение не является числом");
            return;
        }

        double x = scanner.nextDouble();

        if (x < -10 || x > 20) {
            System.err.println("Ошибка! Введённое значение выходит за допустимый диапазон!");
            return;
        }

        double probability = 1.0 / (1.0 + Math.exp(-x));
        String classification;

        if (probability >= 0.5) {
            classification = "Класс 1 (событие скорее наступит)";
        } else {
            classification = "Класс 0 (событие скорее не наступит)";
        }

        System.out.printf("""
        -- Результаты расчётов --
        Входное значение:                    %.4f
        Предсказанная вероятность:           %.4f
        Классификация:                       %s
        """.formatted(x, probability, classification));

        scanner.close();
    }
}
