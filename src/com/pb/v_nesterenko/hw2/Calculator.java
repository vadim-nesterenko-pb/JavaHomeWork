package com.pb.v_nesterenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int operand1 = read.nextInt();
        System.out.println("Введите второе целое число: ");
        int operand2 = read.nextInt();
        System.out.println("Выберите одну операцию: + - * / : ");
        String sign = read.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("На ноль делить нельзя!!!");
                } else {
                    //double quotient = Double.valueOf(operand1) / Double.valueOf(operand2);      почему-то так показивает ошибку Unnecessary boxing...
                    double quotient = (double)operand1/(double)operand2;                               // а так работает нормально..
                    System.out.println(operand1 + " / " + operand2 + " = " + quotient);
                }
                break;
        }
    }
}