package Labs;

import java.util.Scanner;

public class Lab1_2 {
    static Scanner scan;

    static int[] Input() {
        System.out.print("Розмір масиву n (<= 200): ");
        int n = scan.nextInt();
        if (n > 200) {
            System.out.println("Розмір перевищує 200, встановлено 200");
            n = 200;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "]= ");
            a[i] = scan.nextInt();
        }
        return a;
    }

    static void Print(int[] a) {
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void ShiftRight(int[] a, int k) {
        int n = a.length;
        k = k % n;
        for (int step = 0; step < k; step++) {
            int last = a[n - 1];
            for (int i = n - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = last;
        }
    }

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int[] myArray = Input();

        System.out.print("Введіть кількість позицій для зсуву k: ");
        int k = scan.nextInt();

        System.out.println("Початковий масив:");
        Print(myArray);

        ShiftRight(myArray, k);

        System.out.println("Масив після зсуву:");
        Print(myArray);

        scan.close();
    }
}