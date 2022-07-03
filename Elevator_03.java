package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());
        double capacityOfElevator = Double.parseDouble(scanner.nextLine());

        double courses = Math.ceil(persons / capacityOfElevator);
        System.out.printf("%.0f", courses);
    }
}
