public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("\nЗадача1");
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }

        // Задача 2
        System.out.println("\nЗадача2");
        for (int i = 10; i > 1; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }

        // Задача 3
        System.out.println("\nЗадача3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }

        // Задача 4
        System.out.println("\nЗадача4");
        for (int i = 10; i > -10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }

        // Задача 5
        System.out.println("\nЗадача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println( + i + " год является высокосным");
        }

        // Задача 6
        System.out.println("\nЗадача 6");
        for (int i = 7; i < 105; i = i + 7) {
            System.out.println(+i);
        }

        // Задача 7
        System.out.println("\nЗадача 7");
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.println(+i);
        }

        // Задача 8
        System.out.println("\nЗадача 8");
        int savings = 29000;
        int total = 0;
        for (int i = 0; i < 13; i++) {
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        // Задача 9
        System.out.println("\nЗадача9");
        int monthlyFee = 29000;
        double annualInterestRate = 0.12;
        double totalSavings = 0;
        for (int month = 1; month <= 12; month++) {
            totalSavings = (totalSavings + monthlyFee) * (1 + annualInterestRate / 12);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + Math.round(totalSavings) + " рублей");
        }

        // Задача 10
        System.out.println("\nЗадача10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}