import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //to read the input entered
        Random rand = new Random(); //to generate random numbers

        char menu = 'y';
        boolean success;

        do {
            int number = rand.nextInt(10) + 1;
            success = false;

            do {
                System.out.println("Enter a number between (1 - 10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);
            } while (!success);

            System.out.println("Do you want to repeat the game (y/n)");
            menu = input.next().charAt(0);
            input.nextLine();
        } while ((menu == 'Y' || menu == 'y') && success);

        input.close();
    }
}
