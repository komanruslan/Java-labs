package Labs;

import java.util.Scanner;

public class Lab1_3 {
    static Scanner scan;

    static double[][] Input() {
        System.out.print("Введіть розмірність n (<= 15): ");
        int n = scan.nextInt();
        if (n > 15) {
            System.out.println("Розмір перевищує 15, встановлено 15");
            n = 15;
        }
        double[][] a = new double[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print("a[" + i + "][" + j + "]= ");
                a[i][j] = scan.nextDouble();
            }
        }
        return a;
    }

    static void PrintMatrix(double[][] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void CalculateSum(double[][] a) {
        int n = a.length;
        double maxBelow = Double.NEGATIVE_INFINITY;
        boolean hasBelow = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    if (a[i][j] > maxBelow) {
                        maxBelow = a[i][j];
                    }
                    hasBelow = true;
                }
            }
        }

        double sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    if (!hasBelow || a[i][j] > maxBelow) {
                        sum += a[i][j];
                        count++;
                    }
                }
            }
        }

        if (count > 0) {
            System.out.println("Сума елементів: " + sum);
        } else {
            System.out.println("Таких елементів немає.");
        }
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        double[][] matrix = Input();

        System.out.println("\nМатриця:");
        PrintMatrix(matrix);

        CalculateSum(matrix);

        scan.close();
    }
}