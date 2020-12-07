package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FancySequenceTest {

    @Test
    public void testGetIndex() {
        FancySequence fancy = new FancySequence();

        fancy.append(2);
        fancy.addAll(3);
        fancy.append(7);
        fancy.multAll(2);

        assertEquals(10, fancy.getIndex(0));

        fancy.addAll(3);
        fancy.append(10);
        fancy.multAll(2);

        assertEquals(26, fancy.getIndex(0));
        assertEquals(34, fancy.getIndex(1));
        assertEquals(20, fancy.getIndex(2));
    }
}