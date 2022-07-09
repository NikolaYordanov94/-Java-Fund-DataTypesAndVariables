package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0;
        double maxSnowballValue = Double.MIN_VALUE;
        double maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 1; i <= n; i++) {

            double snowballSnow = Double.parseDouble(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);


            if (snowballValue > maxSnowballValue){

                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;

            }
        }
        System.out.printf("%.0f : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);

    }
}
