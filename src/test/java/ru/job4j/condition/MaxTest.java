package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    public void maxWhen5And4Then5() {
        int left = 5;
        int right = 4;
        int expected = 5;
        int result = Max.max(left, right);
        assertEquals(expected, result);
    }

    @Test
    public void maxWhen5And4And3Then5() {
        int left = 5;
        int right = 4;
        int high = 3;
        int expected = 5;
        int result = Max.max(left, right, high);
        assertEquals(expected, result);
    }

    @Test
    public void maxWhen5And4And3And7Then7() {
        int left = 5;
        int right = 4;
        int high = 3;
        int bottom = 7;
        int expected = 7;
        int result = Max.max(left, right, high, bottom);
        assertEquals(expected, result);
    }
}