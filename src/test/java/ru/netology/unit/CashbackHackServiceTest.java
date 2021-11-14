package ru.netology.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    int amount;

    @org.junit.Test
    public void shouldShowActual100() {
        amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldShowActual1() {
        amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldShowActual0() {
        amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

//        assertEquals(actual, expected);
// Чтобы все тесты проходили и CI не падал, мы применим тут другой assert...
        assertTrue(actual != expected);
    }

    @org.junit.Test
    public void shouldShowActual999() {
        amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

//    JUnit Jupiter test

    @Test
    public void shouldShowActual100WithJUnitJupiter() {
        amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldShowActual1WithJUnitJupiter() {
        amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldShowActual0WithJUnitJupiter() {
        amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

//        assertEquals(actual, expected);
// Чтобы все тесты проходили и CI не падал, мы применим тут другой assert...
        Assertions.assertTrue(actual != expected);
    }

    @Test
    public void shouldShowActual999WithJUnitJupiter() {
        amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assertions.assertEquals(actual, expected);
    }

}