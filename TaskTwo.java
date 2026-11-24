import java.util.Scanner;
public class TaskTwo{
public static String isPerfectNumberr(int number){

 System.out.print("Input a number (-1 to stop): ");
        int userInput = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        int total = 0;

        while (userInput != -1) {
            total += userInput;
            double average = (double) total / counter;
            counter++;
            System.out.println("The average is " + average);
            System.out.print("Input a number (-1 to stop): ");
            userInput = Integer.parseInt(scanner.nextLine());
        }
        }
