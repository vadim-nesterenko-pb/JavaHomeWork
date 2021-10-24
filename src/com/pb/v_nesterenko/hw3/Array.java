package com.pb.v_nesterenko.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;

/* в заднии указано: Программа должна позволить пользователю ввести одномерный массив целых чисел
для экономии времени я заболняю масив рандомными числами от -100 до 100 */

        System.out.print("Массив: ");

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
            System.out.print(array[i] + " ");

            sum += array[i];
        }

/* Ручной ввод выглядел бы так
        for (int i = 0; i < 10; i++) {
            System.out.print("Укажите " + (i+1) + "-й элемент масива: ");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
*/
        System.out.println();
        System.out.print("Сума элементов = " + sum);

        System.out.println();
        System.out.print("Положительныйе элементы: ");
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < 9; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    int x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                }
            }
        }

        System.out.println();
        System.out.print("Отсортированый по возрастанию массив: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
