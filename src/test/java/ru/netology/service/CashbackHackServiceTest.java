package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

}