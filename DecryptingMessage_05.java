package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String decryptedWord = "";

        for (int i = 1; i <= n; i++) {

            char letters = scanner.nextLine().charAt(0);
            letters += key;

            decryptedWord += letters;

        }
        System.out.println(decryptedWord);
    }
}
