package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfDaysToEatNOrangesTest {

    @Test
    void testMinDays_Return_4_When_10_Oranges() {
        MinimumNumberOfDaysToEatNOranges minimumNumber = new MinimumNumberOfDaysToEatNOranges();
        assertEquals(4, minimumNumber.minDays(10));
    }

    @Test
    void testMinDays_Return_3_When_6_Oranges() {
        MinimumNumberOfDaysToEatNOranges minimumNumber = new MinimumNumberOfDaysToEatNOranges();
        assertEquals(3, minimumNumber.minDays(6));
    }

    @Test
    void testMinDays_Return_1_When_1_Orange() {
        MinimumNumberOfDaysToEatNOranges minimumNumber = new MinimumNumberOfDaysToEatNOranges();
        assertEquals(1, minimumNumber.minDays(1));
    }

    @Test
    void testMinDays_Return_6_When_56_ranges() {
        MinimumNumberOfDaysToEatNOranges minimumNumber = new MinimumNumberOfDaysToEatNOranges();
        assertEquals(6, minimumNumber.minDays(56));
    }
}