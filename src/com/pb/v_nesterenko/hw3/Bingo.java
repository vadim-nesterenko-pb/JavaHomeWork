package com.pb.v_nesterenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(101);
        Scanner in = new Scanner(System.in);
        int counter = 0;

        for (; ; ) {
            counter++;
            System.out.print("Попытка " + counter + ". Введите число от 0 до 100 или quit, чтобы выйти: ");

            String userText = in.next();
            if (userText.equals("quit")) {
                break;
            } else {
                int userNum = Integer.parseInt(userText);
                if (userNum == randomNum) {
                    System.out.println("Вы угадали c " + counter + " попытки))");
                    break;
                } else if (userNum < randomNum) {
                    System.out.print("Загаданое число больше. ");
                } else {
                    System.out.print("Загаданое число меньше. ");
                }
            }
        }
        System.out.println("Спасибо за игру. ");
    }

}
