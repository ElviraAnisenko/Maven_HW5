package org.example.JAvaHomework5.ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ServiceTest {
    @Test
    void shouldCalculateFirstTest() {
        ServiceWorkRest service = new ServiceWorkRest();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateSecondTest() {
        ServiceWorkRest service = new ServiceWorkRest();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

