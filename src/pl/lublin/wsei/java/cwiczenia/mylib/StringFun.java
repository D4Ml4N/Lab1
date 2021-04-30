package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

public class StringFun {

    public static boolean isPalindrome(String word) {

        return true;
    }


    public static String decamelize(String sentence) {

        sentence = sentence.substring(0, 1).toLowerCase() + sentence.substring(1);

        int dlugosc = sentence.length();
        char charSentence[] = sentence.toCharArray();

        String decamelizeSentence = "";

        for (int i = 0; i < dlugosc; i++) {
            if (Character.isUpperCase(charSentence[i])) {
                decamelizeSentence += " ";
            }
            decamelizeSentence += charSentence[i];

        }
        decamelizeSentence = decamelizeSentence.substring(0, 1).toUpperCase() + decamelizeSentence.substring(1);
        return decamelizeSentence;

    }
}