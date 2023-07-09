// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
    }

    public static void task1() {
        System.out.println("Циклы. Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("Циклы. Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task3() {
        System.out.println("Циклы. Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task4() {
        System.out.println("Циклы. Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task5() {
        System.out.println("Циклы. Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Год является высокосным  " + i);
        }
    }

    public static void task6() {
        System.out.println("Циклы. Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task7() {
        System.out.println("Циклы. Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Интерация цикла " + i);
        }
    }

    public static void task8() {
        System.out.println("Циклы. Задача 8");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
    }


    public static void task9() {
        System.out.println("Циклы. Задача 9");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = (int) (total + total * 0.12);
            total = total + deposit;
            System.out.println("месяц " + i + " сумма накоплений " + total + " рублей.");

        }
    }

    public static void task10() {
        System.out.println("Циклы. Задача 10");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2*" + i + "=" + i * 2);


        }
    }

    public static void task11() {
        System.out.println("Циклы. Задача 11");
        int deposit = 29000;
        int total = 0;
        int i= 1;
        while ( total< 2_459_000 ) {
            total = (int) (total + total +15000);
            total = total + deposit;
            System.out.println("месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
    }
    public static void task12() {
        System.out.println("Циклы. Задача 12");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(+i + " ");}
        System.out.println(" ");

        for (int j =10;j > 0; j--) {
                System.out.print(+j + " ");

        }
    }
    public static void task13() {
        System.out.println("Циклы. Задача 13");
        int population= 12_000_000;
        int natality= 17;
        int deatRate= 8;
        int years= 10;

        for (int year=1; year<= years; year++){
            population = population + population /1000 * natality- population / 1000* deatRate;
            System.out.println("Год " + year + ", численность населения составляет "+ population);
        }
    }
    public static void task14() {
        System.out.println("Циклы. Задача 14");
        float deposit= 15000;
        float percent= 0.07f;
        int finish= 12_000_000;

        for (int mount=1; finish< deposit; mount++ ) {
            deposit += deposit*percent;
            System.out.printf("В месяце %d накоплена сумма %.2f \n", mount, deposit);
            System.out.println("В месяце "+mount+ " накопленная сумма "+deposit);
        }
    }
    public static void task15() {
        System.out.println("Циклы. Задача 15");
        float deposit = 15000;
        float percent = 0.07f;
        int finish = 12_000_000;
        int i = 0;

        for (int mount = 1; finish < deposit; mount++) {

            if (i % 6 == 0) {
                System.out.printf("В месяце %d накоплена сумма %.2f \n", mount, deposit);
                System.out.println("В месяце " + mount + " накопленная сумма " + deposit);

            }
        }
    }
        public static void task16() {
            System.out.println("Циклы. Задача 16");
            int years = 9;
            int mountInYear = years * 12;
            int money = 15000;
            float percent = 0.07f;

            for (int mount = 1; mount <= mountInYear; mount++) {
                if (mount % 6 == 0) {

                System.out.println("В " + mount + " месяце, накоплено " + money);}
                money += money + money * percent;


            }

        }
            }


