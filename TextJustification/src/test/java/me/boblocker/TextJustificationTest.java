package me.boblocker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextJustificationTest {
    private final TextJustification textJustification = new TextJustification();

    @Test
    void testFullJustify_1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = textJustification.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<>();
        expected.add("This    is    an");
        expected.add("example  of text");
        expected.add("justification.  ");

        assertIterableEquals(expected, result);
    }

    @Test
    void testFullJustify_2() {
        String[] words = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        List<String> result = textJustification.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<>();
        expected.add("What   must   be");
        expected.add("acknowledgment  ");
        expected.add("shall be        ");

        assertIterableEquals(expected, result);
    }

    @Test
    void testFullJustify_3() {
        String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth = 20;
        List<String> result = textJustification.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<>();
        expected.add("Science  is  what we");
        expected.add("understand      well");
        expected.add("enough to explain to");
        expected.add("a  computer.  Art is");
        expected.add("everything  else  we");
        expected.add("do                  ");

        assertIterableEquals(expected, result);
    }

    @Test
    void testFullJustify_4() {
        String[] words = {"ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country"};
        int maxWidth = 16;
        List<String> result = textJustification.fullJustify(words, maxWidth);
        List<String> expected = new ArrayList<>();
        expected.add("ask   not   what");
        expected.add("your country can");
        expected.add("do  for  you ask");
        expected.add("what  you can do");
        expected.add("for your country");

        assertIterableEquals(expected, result);
    }
}