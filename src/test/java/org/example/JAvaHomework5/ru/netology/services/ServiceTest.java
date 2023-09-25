package org.example.JAvaHomework5.ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class ServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateFirstTest(int income, int expenses, int threshold, int expected) {
        ServiceWorkRest service = new ServiceWorkRest();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

