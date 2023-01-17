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
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            a--;
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;   // население
        double birthRate = 17 / 1000f;     // рождаемость на 1000 человек
        double mortalityRate = 8 / 1000f;  // смертность на 1000 человек
        int years = 0;
        while (years < 10) {
            population = (int) (population + population * (birthRate - mortalityRate)); // конечно лучше привести к int каждый рейт отдельно
            years++;
            System.out.printf("Год %d, численность населения составляет %d \n", years, population);
        }
        // итог 13_124_802, с приведением отдельно получилось бы 13_124_807
    }

    public static void task4() {
        System.out.println("Задача 4");
        double deposit = 15_000; // вклад
        double percent = 0.07;
        int month = 0; // порядковый номер месяца
        while (deposit < 12_000_000) {
            deposit = deposit + deposit * percent; // работаю в криптовалюте =)
            month++;
            System.out.printf("Месяц %d сумма накоплений равна %.2f рублей \n", month, deposit);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double deposit = 15_000; // вклад
        double percent = 0.07;
        int month = 0; // порядковый номер месяца
        while (deposit < 12_000_000) {
            deposit = deposit + deposit * percent; // работаю в криптовалюте =)
            month++;
            if (month % 6 == 0) { // иногда посматриваю депозит
                System.out.printf("Месяц %d сумма накоплений равна %.2f рублей \n", month, deposit);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double deposit = 15_000; // вклад
        double percent = 0.07;
        int month = 0; // порядковый номер месяца
        int yearsDeposit = 9; // Вася поверил в себя
        int monthsDeposit = yearsDeposit*12;
        while (month < monthsDeposit) {
            deposit = deposit + deposit * percent; // работаю в криптовалюте =)
            month++;
            if (month % 6 == 0) { // иногда посматриваю депозит
                System.out.printf("Месяц %d сумма накоплений равна %.2f рублей \n", month, deposit);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int days = 31;
        int friday = 1;
        for (int today = 1; today <= days; today++) {
            if (today == friday || today%7 == friday){
                System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n",today);
            }
        }

    }

    public static void task8() {
        System.out.println("Задача 8");
    }
}