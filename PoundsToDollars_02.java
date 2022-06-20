package DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPounds = Double.parseDouble(scanner.nextLine());

        double convertBritishPoundsToUSDollars = britishPounds * 1.36;

        System.out.printf("%.3f", convertBritishPoundsToUSDollars);
    }
}
