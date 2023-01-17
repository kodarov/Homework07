public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        double deposit = 0; // вклад
        double payment = 15_000; // накопления ежемесячные
        int month = 0; // порядковый номер месяца
        while (deposit < 2_459_000) {
            deposit = deposit + payment;
            month++;
            System.out.printf("Месяц %d сумма накоплений равна %.2f рублей \n", month, deposit);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
    }

    public static void task3() {
        System.out.println("Задача 3");
    }

    public static void task4() {
        System.out.println("Задача 4");
    }

    public static void task5() {
        System.out.println("Задача 5");
    }

    public static void task6() {
        System.out.println("Задача 6");
    }

    public static void task7() {
        System.out.println("Задача 7");
    }

    public static void task8() {
        System.out.println("Задача 8");
    }
}