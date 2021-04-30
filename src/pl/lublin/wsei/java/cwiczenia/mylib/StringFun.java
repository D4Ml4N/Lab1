package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;

public class StringFun {

    public static boolean isPalindrome(String word){

return true;
    }


    public static String camelize(String word) {
        String output = "";
        String[] words = word.split(" ");

        for(int i=0; i < words.length; i++){
            words[i] = StringUtils.capitalize(words[i]);
            output = StringUtils.join(words);
        }
        return output;
    }
}