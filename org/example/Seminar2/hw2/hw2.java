package org.example.Seminar2.hw2;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность
 * является возрастающей
 */
public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int n = scanner.nextInt();
        boolean increase = true;
        System.out.println("numbers:");
        int num1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                increase = false;
            }
            num1 = num2;
        }
        scanner.close();
        System.out.println(increase);
    }

}