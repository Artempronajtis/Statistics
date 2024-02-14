package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.javaqa.javaqamvn.services.StatisticsService.*;

public class StatisticsServiceTest {

    @Test
    public void testCalculateTotalSales() {

        int[] testSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalSales = 180;

        int actualTotalSales = calculateTotalSales(testSales);

        assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void testCalculateAverageSales() {

        int[] testSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expectedAverageSales = 15;

        double actualAverageSales = calculateAverageSales(testSales);

        assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void testFindPeakMonth() {

        int[] testSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedPeakMonth = 6;

        int actualPeakMonth = findPeakMonth(testSales);

        assertEquals(expectedPeakMonth, actualPeakMonth);
    }

    @Test
    public void testFindMinMonth() {

        int[] testSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;

        int actualMinMonth = findMinMonth(testSales);

        assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void testCountMonthsBelowAverage() {

        int[] testSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCount = 5;

        int actualCount = countMonthsBelowAverage(testSales);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountMonthsAboveAverage() {

        int[] testSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCount = 5;

        int actualCount = countMonthsAboveAverage(testSales);

        assertEquals(expectedCount, actualCount);
    }

}
