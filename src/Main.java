import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int monthlySavings = 15000;
        int totalSavings = 0;
        int i = 1;
        while (totalSavings <= 2_459_000) {
            totalSavings = totalSavings + totalSavings / 100;
            totalSavings = totalSavings + monthlySavings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavings + " рублей");
            i++;
        }

        System.out.println("Task 2");
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i--;
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("Task 3");
        int population = 12_000_000;
        int birthRatePerThousand = 17;
        int deathsPerThousand = 8;

        for (i = 1; i <= 10; i++) {
            population = population + (population * birthRatePerThousand / 1000) - (deathsPerThousand * 8 / 1000);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        System.out.println("Task 4");
        int depositAmount = 15_000;
        i = 1;
        while (depositAmount <= 12_000_000) {
            depositAmount = depositAmount + depositAmount * 7 / 100;
            System.out.println("по окончании месяца " + i + ", сумма накопления Васи составляет " + depositAmount);
            i++;
        }

        System.out.println("Task 5");
        depositAmount = 15_000;
        i = 1;
        while (depositAmount <= 12_000_000) {
            depositAmount = depositAmount + depositAmount * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("по окончании месяца " + i + ", сумма накопления Васи составляет " + depositAmount);
            }
            i++;
        }


        System.out.println("Task 6");
        depositAmount = 15_000;
        i = 1;
        int months = 12 * 9;
        for (i = 0; i <= months; i++) {
            depositAmount = depositAmount + depositAmount * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("по окончании месяца " + i + ", сумма накопления Васи составляет " + depositAmount);
            }
        }

        System.out.println("Task 7");

        int firstDayMonth = 1;
        int lastDayMonth = firstDayMonth + 31;
        for (i = 1; i <= lastDayMonth; i++) {
            if (i % 7 == 5 ) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println("Task 8");

        int thisYear =2023;
        int frequencyComet = 79;
        int yearsBefore = thisYear - 200;
        int yearsAfter = thisYear + 100;

        for (int j = yearsBefore; j <= yearsAfter ; j++) {
            if ( j % frequencyComet == 0 ) {
                System.out.println(j);
            }
        }

    }
}