package ru.netology;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {

                maxMonth = month;
            }
            month = month + 1;

        }
        return maxMonth + 1;
    }

    public long allSales(long[] sales) {

        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;


    }

    public long averageSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result / 12;

    }

    public long lowAverageSales(long[] sales) {
        long month = 0;
        for (long sale : sales) {

            if (sale < averageSales(sales)) {
                month = month + 1;

            }
        }
        return month;
    }

    public long highAverageSales(long[] sales) {
        long month = 0;
        for (long sale : sales) {

            if (sale > averageSales(sales)) {
                month = month + 1;

            }
        }
        return month;
    }
}





