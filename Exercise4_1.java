import java.util.Scanner;
public class Exercise4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask how many numbers te user wants to enter
        System.out.print("How many numbers do you want to enter? ");
        int size = input.nextInt();

        //Create an array of that size
        int[] numbers = new int[size];

        //Use a for loop to enter numbers
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter number " + (i + 1) + ":");
            numbers[i] = input.nextInt();
        }

        //Print only even numbers and their indices
        System.out.println("Even numbers and their indices: ");

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                System.out.println("Index " + i + ":" + numbers[i]);
            } 
        }

        //Calculate total using enhanced for loop
        int total = 0;
        for(int number : numbers){
            total += number;
        }
        System.out.println("Total of all numbers: " + total);

        input.close();
    }
}