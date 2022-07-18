package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void Amount1500Return300() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1700;

        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @Test
    void Amount1000Return1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }


}