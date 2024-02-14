package ru.netology.javaqa.javaqamvn.services;

public class StatisticsService {
    public static int calculateTotalSales(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    public static double calculateAverageSales(int[] sales) {
        int total = calculateTotalSales(sales);
        return (double) total / sales.length;
    }

    public static int findPeakMonth(int[] sales) {
        int maxSales = 0;
        int peakMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                peakMonth = i;
            }
        }
        return peakMonth + 1;
    }

    public static int findMinMonth(int[] sales) {
        int minSales = Integer.MAX_VALUE;
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public static int countMonthsBelowAverage(int[] sales) {
        double average = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public static int countMonthsAboveAverage(int[] sales) {
        double average = calculateAverageSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }


}
