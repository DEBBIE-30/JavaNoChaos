import java.util.Scanner;
public class TaskFour{
public static void main (String[] args) {
Scanner input = new Scanner;

System.out.print("Input a string: ");
        String word = input.nextLine();
        String reversedString = "";

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            reversedString = character + reversedString;
        }

        if (reversedString.equals(word)) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }
    }
