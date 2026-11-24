import java.util.Scanner;
public class TaskEleven{
public static void main (String[] args) {
Scanner input = new Scanner;

System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char character = sentence.charAt(i);
            if (character != ' ') {
                word += character;
            } else {
                if (!word.equals("")) {
                    System.out.println(word);
                }
                word = "";
            }
        }

        if (!word.equals("")) {
            System.out.println(word);
        }
    }
}
