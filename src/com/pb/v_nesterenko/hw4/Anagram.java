package com.pb.v_nesterenko.hw4;

import java.util.Scanner;

public class Anagram {
    static String onlyLatters(String phrase) {      //этим методом удалял все символы кроме буков)
        char[] symb = phrase.toCharArray();
        String modPhrase = "";

        for (char ch : symb)
            if (Character.isLetter(ch))
                modPhrase += ch;
        return modPhrase;
    }

    static String sortedString(String phrase){     //этим методом проводил сортировку символов строки по возврастанию
        char[] arSymb = phrase.toCharArray();

        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int i = 0; i < arSymb.length-1; i++)
                if (arSymb[i] > arSymb[i + 1]) {
                    sorted = false;
                    char ch = arSymb[i+1];
                    arSymb[i+1] = arSymb[i];
                    arSymb[i] = ch;
                }
        }
        String modifyPhrase = "";
        for (char ch : arSymb) {
            modifyPhrase += ch;
        }
        return modifyPhrase;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую фразу: ");
        String fstPhrase = in.nextLine();

        fstPhrase = onlyLatters(sortedString(fstPhrase));

        System.out.println("Введите вторую фразу: ");
        String sndPhrase = in.nextLine();
        sndPhrase = onlyLatters(sortedString(sndPhrase));

        if(fstPhrase.equals(sndPhrase))
            System.out.println("Это анаграмы. ");
        else System.out.println("Это НЕ анаграмы. ");
    }
}
