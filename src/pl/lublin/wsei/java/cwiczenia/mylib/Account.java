package pl.lublin.wsei.java.cwiczenia.mylib;
import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;


    private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","i","y","ji", "j",
            "k","l","m","n","o","p","r","s","t","u","f","h","c",
            "ch","sh","shh","'","ju","ja"};

    public static String translit (String input) {
        input = input.toLowerCase();

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < input.length(); i++){
            char character = input.charAt(i);

            int index = ukrAlphabet.indexOf(character);

            if(index != -1)
                builder.append(translitRepl[index]);
            else
                builder.append(character);
        }

        return builder.toString();
    }

    public void setName(String name) {
        this.name = capitalize(name);
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }

    public String getName() {
        return name;
    }
}