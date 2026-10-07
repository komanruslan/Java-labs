package Labs;

import java.util.Scanner;

public class Lab1 {

    private static double calculate(double x, double y) {
        return (2 * x * x + x * y) / Math.pow(x * y, 2) 
             + (3 * x * y - Math.pow(y, 3)) / (x * x + 2 * y * y);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Варіант 1 (double -> double)");
        System.out.print("x = ");
        double x1 = scan.nextDouble();
        System.out.print("y = ");
        double y1 = scan.nextDouble();
        double res1 = calculate(x1, y1);
        System.out.println("Результат = " + res1);

        System.out.println("\nВаріант 2 (int -> double)");
        System.out.print("x = ");
        int x2 = scan.nextInt();
        System.out.print("y = ");
        int y2 = scan.nextInt();
        double res2 = calculate(x2, y2);
        System.out.println("Результат = " + res2);

        System.out.println("\nВаріант 3 (double -> int)");
        System.out.print("x = ");
        double x3 = scan.nextDouble();
        System.out.print("y = ");
        double y3 = scan.nextDouble();
        int res3 = (int) calculate(x3, y3);
        System.out.println("Результат = " + res3);

        scan.close();
    }
}