import java.util.Scanner;
public class TaskTen{
public static void main (String[] args) {
Scanner input = new Scanner;

Random random = new Random();
        int randNum = random.nextInt(100) + 1; // 1 to 100
        int guesses = 0;
        int userInput;

        do {
            System.out.print("Input a number: ");
            userInput = Integer.parseInt(scanner.nextLine());
            guesses++;
        } while (userInput != randNum);

        System.out.println("Well guessed");
        System.out.println("You took " + guesses + " attempts");
    }
    }
