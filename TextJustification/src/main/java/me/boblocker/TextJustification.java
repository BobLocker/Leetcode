package me.boblocker;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> oneLineWords = new ArrayList<>();

        int sizeWithOutSpaces = words[0].length();
        oneLineWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (sizeWithOutSpaces + oneLineWords.size() + word.length() <= maxWidth) {
                sizeWithOutSpaces += word.length();
            } else {
                result.add(getBeautiful(oneLineWords, sizeWithOutSpaces, maxWidth));
                sizeWithOutSpaces = word.length();
                oneLineWords.clear();
            }
            oneLineWords.add(word);
        }

        result.add(getLastBeautiful(oneLineWords, sizeWithOutSpaces, maxWidth));
        return result;
    }

    private String getBeautiful(List<String> input, int sizeWithOutSpaces, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        if (input.size() == 1) {
            sb.append(input.get(0));
            for (int i = 0; i < maxWidth - sizeWithOutSpaces; i++) {
                sb.append(" ");
            }
        } else {
            int spacesCount = maxWidth - sizeWithOutSpaces;
            int wordsCount = input.size();
            sb.append(input.remove(0));

            int remainder = spacesCount % (wordsCount -1);
            int top = spacesCount / (wordsCount -1);
            for (String word : input) {
                for (int i = 0 ; i < top; i++) {
                    sb.append(" ");
                }
                if (remainder > 0) {
                    sb.append(" ");
                    remainder--;
                }

                sb.append(word);
            }
        }
        return sb.toString();
    }
    private String getLastBeautiful(List<String> input, int sizeWithOutSpaces, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        int wordsCount = input.size();
        String firstWord = input.remove(0);
        sb.append(firstWord);
        for (String word : input) {
            sb.append(" ");
            sb.append(word);
        }

        for (int i = 0; i < maxWidth - sizeWithOutSpaces - (wordsCount-1); i++) {
            sb.append(" ");
        }

        return sb.toString();
    }
}
