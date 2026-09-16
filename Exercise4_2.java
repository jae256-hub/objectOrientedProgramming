import java.util.Random;
import java.util.Scanner;

public class Exercise4_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(31) + 20;

        System.out.println("Choose a loop:");
        System.out.println("1. While loop");
        System.out.println("2. Do-while loop");
        System.out.println("3. For loop");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        // While loop
        if (choice == 1) {

            int guess = 10;

            while (guess != number) {

                System.out.print("Guess the number: ");
                guess = input.nextInt();

                if (guess > number) {
                    System.out.println("Too high! Try again.");
                } 
                else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } 
                else {
                    System.out.println("Correct! You guessed it.");
                }
            }
        }

        // Do-while loop
        else if (choice == 2) {

            int guess = 60;

            do {

                System.out.print("Guess the number: ");
                guess = input.nextInt();

                if (guess > number) {
                    System.out.println("Too high! Try again.");
                } 
                else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } 
                else {
                    System.out.println("Correct! You guessed it.");
                }

            } while (guess != number);
        }

        // For loop
        else if (choice == 3) {

            for (;;) {

                System.out.print("Guess the number: ");
                int guess = input.nextInt();

                if (guess > number) {
                    System.out.println("Too high! Try again.");
                } 
                else if (guess < number) {
                    System.out.println("Too low! Try again.");
                } 
                else {
                    System.out.println("Correct! You guessed it.");
                    break;
                }
            }
        }

        else {
            System.out.println("Invalid choice.");
        }

        input.close();
    }
}  