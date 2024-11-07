package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class ServiceTest {

    @ParameterizedTest

    @CsvFileSource(files="src/test/java/resources/Service.csv")
    public void testService(int expected, int income, int expenses, int threshold) {

        Service service = new Service();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
        System.out.println("Удастся отдохнуть " + actual + " месяца(ев)");
    }
}
