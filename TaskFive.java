import java.util.Scanner;
public class TaskFive{
public static void main (String[] args) {
Scanner input = new Scanner;

System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase().trim();
        int vowelCounter = 0;
        int consonantCounter = 0;

        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if ("aeiou".indexOf(character) != -1) {
                vowelCounter++;
            } else if (Character.isLetter(character)) {
                consonantCounter++;
            }
        }
        System.out.println("There are " + vowelCounter + " vowels in this word and "
                + consonantCounter + " consonants in this word");
    }
