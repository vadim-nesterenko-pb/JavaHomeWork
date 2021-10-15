package com.pb.v_nesterenko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Введите число от 0 до 100: ");
        int n = read.nextInt();
        if (n >= 0 && n < 15) {
            System.out.println("Число попвадает в промежуток 0 - 14 ");
        } else if (n > 14 && n < 36) {
            System.out.println("Число попвадает в промежуток 15 - 35 ");
        } else if (n > 35 && n < 51) {
            System.out.println("Число попвадает в промежуток 35 - 50 ");
        } else if (n > 50 && n <= 100) {
            System.out.println("Число попвадает в промежуток 51 - 100 ");
        } else System.out.println("Число не попало в требуемый промежуток");
    }

}
