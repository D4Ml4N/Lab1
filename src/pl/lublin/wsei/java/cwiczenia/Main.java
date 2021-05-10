package pl.lublin.wsei.java.cwiczenia;
import static pl.lublin.wsei.java.cwiczenia.StrongPasswordGenerator.Generate;

public class Main {

    public static void main(String[] args) {

            Generate(16, true,true,true,true,"!@#$%^&*()");
            System.out.print("\n");
    }
}


