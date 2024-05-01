import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Instructions printed for the user.
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess it as few tries as possible.");
        
        // Initialize the game settings.
        int number = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        
        // Game loop begins
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < number) {
                System.out.println("Higher!");
            } else if (guess > number) {
                System.out.println("Lower!");
            }
        }
        
        // Conclusion of the game
        System.out.println("Congratulations! You guessed the number " + number + " correctly in " + attempts + " guesses.");
        
        scanner.close();
    }
}
