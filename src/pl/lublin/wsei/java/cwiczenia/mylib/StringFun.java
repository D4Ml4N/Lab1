package pl.lublin.wsei.java.cwiczenia.mylib;

public class StringFun {
    public static boolean isPalindrome(String word){
return true;
    }

    public static String anarchize(String word){
        StringBuilder builder = new StringBuilder();

        boolean nextCase = Character.isUpperCase(word.charAt(0));
        nextCase = !nextCase;

        builder.append(word.charAt(0));

        for(int i = 1; i < word.length(); i++){
            if(nextCase){
                builder.append(Character.toUpperCase(word.charAt(i)));
            }else{
                builder.append(Character.toLowerCase(word.charAt(i)));
            }

            nextCase = !nextCase;
        }

        return builder.toString();
    }
}