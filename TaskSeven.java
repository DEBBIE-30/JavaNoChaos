import java.util.Scanner;
public class TaskSeven{
public static void main (String[] args) {
Scanner input = new Scanner;

System.out.print("Input a string: ");
        String userInput = scanner.nextLine();
        String reversedString = "";

        for (int i = 0; i < userInput.length(); i++) {
            char character = userInput.charAt(i);
            reversedString = character + reversedString;
        }
        System.out.println(reversedString);
    }
}
