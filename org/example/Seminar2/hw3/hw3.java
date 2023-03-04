package org.example.Seminar2.hw3;

import java.util.Scanner;

/**
 * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов
 * двузначных элементов массива
 */
public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println("numbers:");
        int[] mass = new int[n];
        int summIndices = 0;
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
            if (Math.abs(mass[i]) > 9 && Math.abs(mass[i]) < 100) {
                summIndices += i;
            }
        }
        scanner.close();
        for (int i = 0; i < n; i++) {
            if (mass[i] < 0) {
                mass[i] = summIndices;
            }
            System.out.print(mass[i] + " ");
        }
    }
}