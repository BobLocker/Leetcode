package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelfCrossingTest {
    private final SelfCrossing selfCrossing = new SelfCrossing();

    @Test
    void testIsSelfCrossing_1() {
        int[] input = {2,1,1,2};
        assertTrue(selfCrossing.isSelfCrossing(input));
    }

    @Test
    void testIsSelfCrossing_2() {
        int[] input = {1,2,3,4};
        assertFalse(selfCrossing.isSelfCrossing(input));
    }

    @Test
    void testIsSelfCrossing_3() {
        int[] input = {1,1,1,1};
        assertTrue(selfCrossing.isSelfCrossing(input));
    }
}