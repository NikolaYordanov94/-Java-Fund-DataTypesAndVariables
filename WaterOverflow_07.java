package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countTotalLitresOfWater = 0;

        for (int i = 1; i <= n; i++) {

            int litresOfWater = Integer.parseInt(scanner.nextLine());
            countTotalLitresOfWater += litresOfWater;

            if(countTotalLitresOfWater > 255){
                System.out.println("Insufficient capacity!");
                countTotalLitresOfWater -= litresOfWater;
            }

        }
        System.out.println(countTotalLitresOfWater);
    }
}