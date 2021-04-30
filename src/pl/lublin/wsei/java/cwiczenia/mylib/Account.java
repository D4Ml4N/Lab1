package pl.lublin.wsei.java.cwiczenia.mylib;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Account {
    private String decamelize;

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String tekst = null;
        do {
            System.out.print("\nWprowadź tekst: ");
            tekst = scanner.nextLine();
            System.out.print(StringFun.decamelize(tekst));

        }while (true);
    }
}
