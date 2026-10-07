package Labs;

import java.util.Scanner;

public class Lab1_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scan.nextLine();

        String[] words = text.split("[ ,.:;?!-]+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty() && word.length() % 2 == 0) {
                result.append(word).append(" ");
            }
        }

        System.out.println("\nТекст після вилучення слів непарної довжини:");
        System.out.println(result.toString().trim());

        scan.close();
    }
}