package com.pb.v_nesterenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static String capletta(String phrase) {     //или всё же котлета, хм...
        String resultPhrase = "";
        char[] arrOfSymb = phrase.toCharArray();
        arrOfSymb[0] = Character.toUpperCase(arrOfSymb[0]);
        for (int i = arrOfSymb.length; i > 0; i--) {
            if (!Character.isLetter(arrOfSymb[i - 1])) {
                arrOfSymb[i] = Character.toUpperCase(arrOfSymb[i]);
            }
        }
        for (int i = 0; i < arrOfSymb.length; i++) {
            resultPhrase += arrOfSymb[i];
        }
        return resultPhrase;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String userPhrase = in.nextLine();

        System.out.println(capletta(userPhrase));

    }

}
