package org.example.Seminar2.hw1;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел
 */
public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int n = scanner.nextInt();
        int summ = 0;
        System.out.println("numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (checkPrimeNumber(num)) {
                summ += num;
            }
        }
        scanner.close();
        System.out.println("Summ prime numbers = " + summ);
    }

    public static boolean checkPrimeNumber(int n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}