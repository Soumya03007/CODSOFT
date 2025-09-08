import java.util.Random;
import java.util.Scanner;

class NumberGuessGame {
    private final int minRange;
    private final int maxRange;
    private final int maxAttempts;
    private final Scanner scanner;
    private final Random random;

    public NumberGuessGame(int minRange, int maxRange, int maxAttempts) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.maxAttempts = maxAttempts;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void start() {
        System.out.println("Welcome to the Number Guessing Game!");
        boolean playAgain;
        int roundsWon = 0;

        do {
            boolean won = playRound();
            if (won) {
                roundsWon++;
            }
            playAgain = askPlayAgain();
        } while (playAgain);

        System.out.println("Thanks for playing! You won " + roundsWon + " round(s). Goodbye!");
    }

    private boolean playRound() {
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attemptsLeft = maxAttempts;

        System.out.println("\nI have chosen a number between " + minRange + " and " + maxRange + ".");
        System.out.println("You have " + maxAttempts + " attempts. Try to guess it!");

        while (attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            int guess = getUserInput();

            if (guess == targetNumber) {
                System.out.println("Correct! You guessed the number in " + (maxAttempts - attemptsLeft + 1) + " attempt(s).");
                return true;
            } else if (guess < targetNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attemptsLeft--;
            if (attemptsLeft > 0) {
                System.out.println("Attempts left: " + attemptsLeft);
            }
        }

        System.out.println("Out of attempts! The correct number was: " + targetNumber);
        return false;
    }

    private int getUserInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    private boolean askPlayAgain() {
        System.out.print("\nDo you want to play again? (y/n): ");
        String response = scanner.next().trim().toLowerCase();
        return response.equals("y");
    }

    public static void main(String[] args) {
        NumberGuessGame game = new NumberGuessGame(1, 100, 5);
        game.start();
    }
}
