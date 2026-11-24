 import java.util.Scanner;
public class TaskOne{
public static void main (String[] args) {
Scanner input = new Scanner;
for (int counter = 100; counter < 1000; counter++) {
            int digit_one = counter % 10;
            int digit_two= (counter / 10) % 10;
            int digit_three = counter / 100;

            if (digit_one * digit_one + digit_two=  * digit_two=  + digit_three * digit_three == counter) {
                System.out.print(counter + " ");
            }
        }
        System.out.println();
    }
    }


