package pl.lublin.wsei.java.cwiczenia; // deklaracja pakietu package lab1

import pl.lublin.wsei.java.cwiczenia.mylib.Account;



public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("piotr Gołabek");
        System.out.println(acc.getName());
        System.out.printf("%s %n", Account.translit("дамиан галковски"));
    }
}


