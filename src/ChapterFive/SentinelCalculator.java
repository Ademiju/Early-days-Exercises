package ChapterFive;

import java.util.Scanner;

public class SentinelCalculator {

    public static void main(String[] args) {

        System.out.println("Enter any number or Enter -42 to end the application");

        double count = 0;
        double total = 0;
        Scanner input = new Scanner(System.in);
        double userInput = input.nextDouble();
        while(userInput != -42){

            total += userInput;
            count++;
            System.out.println("Enter any number or Enter -42 to end the application");
            userInput = input.nextDouble();

        }

            double average = total / count;
        System.out.println("The sum of all the numbers you entered is "+total);
        System.out.println("The average of all the numbers you entered is "+average);
    }
}
