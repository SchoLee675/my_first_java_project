import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(10) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;
        
        System.out.println("🤖 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 10. Can you guess it?");
        
        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            }
        }
        
        System.out.println("\n🎉 Congratulations! You guessed the number in " + numberOfTries + " tries.");
        scanner.close();
    }
}
