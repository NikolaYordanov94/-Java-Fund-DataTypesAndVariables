package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startAscii = Integer.parseInt(scanner.nextLine());
        int endAscii = Integer.parseInt(scanner.nextLine());

        for (int i = startAscii; i <= endAscii ; i++) {

            char PartOfAscii = (char) i;
            System.out.printf("%c ", PartOfAscii);
        }
    }
}
