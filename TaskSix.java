import java.util.Scanner;
public class TaskSix{
public static void main (String[] args) {
Scanner input = new Scanner;

 System.out.print("Input a word: ");
        String word = scanner.nextLine();

        for (int counter = 0; counter < word.length(); counter++) {
            if (counter % 2 == 0) {
                System.out.print(word.charAt(counter) + " ");
            }
        }
        System.out.println();
    }
    }
