package NumberGuessingGame;

import java.util.*;
public class NumberGuessingGame {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int lowerBound = 1;
	        int upperBound = 100;
	        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	        int attempts = 0;
	        int maxAttempts = 10; // You can change this value to limit the number of attempts
	        int score = 0;
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);
	        
	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess: ");
	            int userGuess = scanner.nextInt();
	            attempts++;
	            
	            if (userGuess < lowerBound || userGuess > upperBound) {
	                System.out.println("Please guess a number within the range.");
	            } else if (userGuess < numberToGuess) {
	                System.out.println("Try a higher number.");
	            } else if (userGuess > numberToGuess) {
	                System.out.println("Try a lower number.");
	            } else {
	                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                score += maxAttempts - attempts + 1; // You can change the scoring system
	                break;
	            }
	        }
	        
	        if (attempts == maxAttempts) {
	            System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + numberToGuess);
	        }
	        
	        System.out.println("Your score: " + score);
	        
	        scanner.close();
	 }
}
