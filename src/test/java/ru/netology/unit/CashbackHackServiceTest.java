package ru.netology.unit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    int amount;

    @org.testng.annotations.Test
    public void shouldShowActual100() {
        amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }


    @org.testng.annotations.Test
    public void shouldShowActual1() {
        amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldShowActual0() {
        amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
// Чтобы все тесты проходили и CI не падал, мы применим тут другой assert...
//        assertTrue(actual != expected);
    }

    @org.testng.annotations.Test
    public void shouldShowActual999() {
        amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}