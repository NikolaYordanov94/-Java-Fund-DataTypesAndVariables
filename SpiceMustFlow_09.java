package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        // всеки ден намаляме добива от нивата с 26 = yield - 26
        int days = 0;
        int totalAmountSpices = 0;

        while (yield >= 100){
            int spices = yield - 26;
            totalAmountSpices += spices;
            days++;
            yield -= 10;
        }
        if(totalAmountSpices >= 26){

            totalAmountSpices = totalAmountSpices - 26;
        }
        System.out.println(days);
        System.out.println(totalAmountSpices);


    }
}
