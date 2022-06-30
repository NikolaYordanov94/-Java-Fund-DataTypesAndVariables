package DataTypesAndVariables;

import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double L, W, H = 0;
        System.out.print("Length: ");
        L = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        W = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        H = Double.parseDouble(scanner.nextLine());
        H = (L * W * H) / 3;
        System.out.printf("Pyramid Volume: %.2f", H);

    }
}
