package DataTypesAndVariablesMoreExercises;

import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long digitsOfLeftNum = 0;
        long digitsOfRightNum = 0;
        int countDigitsOfLeftNum = 0;
        int countDigitsOfRightNum = 0;

        for (int i = 1; i <= n; i++) {
            long leftNum = scanner.nextLong();
            long rightNum = scanner.nextLong();

                if (leftNum > rightNum){
                    while (leftNum != 0){
                        digitsOfLeftNum = leftNum % 10;
                        countDigitsOfLeftNum += digitsOfLeftNum;
                        leftNum /= 10;
                    }
                    System.out.println(Math.abs(countDigitsOfLeftNum));
                }else{
                    while (rightNum != 0){
                        digitsOfRightNum = rightNum % 10;
                        countDigitsOfRightNum += digitsOfRightNum;
                        rightNum /= 10;
                    }
                    System.out.println(Math.abs(countDigitsOfRightNum));
                }
            countDigitsOfLeftNum = 0;
            countDigitsOfRightNum = 0;
            }
        }
    }

