public class Main {
    public static void main(String[] args) {

        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();

    }

    // 1
    public static void task1() {

        int rubles = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total += rubles;
            i++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей. \n", i, total);
        }
        System.out.println("Потребуется месяцев: " + i);
    }


    // 2
    public static void task2() {

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    // 3
    public static void task3() {

        int population = 12_000_000;
        int birthRate = 17;
        int deadRate = 8;
        for (int i = 1; i <= 10; i++) {
            population = population + population / 1000 * (birthRate - deadRate);
            System.out.printf("Год %d численность населения составляет %d \n", i, population);
        }

    }

    // 4
    public static void task4() {

        int rubles = 15000;
        int i = 0;
        while (rubles <= 12_000_000) {
            rubles = rubles + (rubles * 7 / 100);
            i++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", i, rubles);
        }
    }

    // 5
    public static void task5() {

        int rubles = 15_000;
        for (int i = 1; rubles <= 12_000_000; i++) {
            rubles = rubles + (rubles * 7 / 100);
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", i, rubles);
            }
        }
    }

    // 6
    public static void task6() {

        int rubles = 15_000;
        for (int i = 1; i <= (9 * 12); i++) {
            rubles = rubles + (rubles * 7 / 100);
            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %d рублей.\n", i, rubles);
            }
        }
    }

    // 7
    public static void task7 () {

        for (int i = 4; i <= 31; i += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет \n", i);
        }
    }

    // 8
    public static void task8 () {

        int start = 2023 - 200;
        int finish = 2023 + 100;
        for (int i = start;i <= finish; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
