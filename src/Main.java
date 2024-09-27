import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerAChoice = "";
        String playerBChoice = "";
        String playAgain = "";
        boolean doneInput = false;

        do {
            // Player A's turn
            do {
                System.out.println("Player A, enter your Rock, Paper, Scissors move [R, P, S]: ");
                playerAChoice = in.nextLine();
                if (playerAChoice.equalsIgnoreCase("R")) {
                    System.out.println("Player A chose Rock!");
                    break;
                } else if (playerAChoice.equalsIgnoreCase("P")) {
                    System.out.println("Player A chose Paper!");
                    break;
                } else if (playerAChoice.equalsIgnoreCase("S")) {
                    System.out.println("Player A chose Scissors!");
                    break;
                } else {
                    System.out.println("Invalid choice! Please enter R, P, or S.");
                }
            } while (true);

            // Player B's turn
            do {
                System.out.println("Player B, enter your Rock, Paper, Scissors move [R, P, S]: ");
                playerBChoice = in.nextLine();
                if (playerBChoice.equalsIgnoreCase("R")) {
                    System.out.println("Player B chose Rock!");
                    break;
                } else if (playerBChoice.equalsIgnoreCase("P")) {
                    System.out.println("Player B chose Paper!");
                    break;
                } else if (playerBChoice.equalsIgnoreCase("S")) {
                    System.out.println("Player B chose Scissors!");
                    break;
                } else {
                    System.out.println("Invalid choice! Please enter R, P, or S.");
                }
            } while (true);

            // Determine the result
            if (playerAChoice.equalsIgnoreCase(playerBChoice)) {
                System.out.println("It's a tie!");
            } else if (playerAChoice.equalsIgnoreCase("R") && playerBChoice.equalsIgnoreCase("S")) {
                System.out.println("Rock crushes Scissors, Player A wins!");
            } else if (playerAChoice.equalsIgnoreCase("R") && playerBChoice.equalsIgnoreCase("P")) {
                System.out.println("Paper covers Rock, Player B wins!");
            } else if (playerAChoice.equalsIgnoreCase("P") && playerBChoice.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock, Player A wins!");
            } else if (playerAChoice.equalsIgnoreCase("P") && playerBChoice.equalsIgnoreCase("S")) {
                System.out.println("Scissors cuts Paper, Player B wins!");
            } else if (playerAChoice.equalsIgnoreCase("S") && playerBChoice.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper, Player A wins!");
            } else if (playerAChoice.equalsIgnoreCase("S") && playerBChoice.equalsIgnoreCase("R")) {
                System.out.println("Rock crushes Scissors, Player B wins!");
            }

            // Ask to play again
            System.out.println("Do you want to play again? [Y/N]");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("N")) {
                doneInput = true;
            } else if (!playAgain.equalsIgnoreCase("Y")) {
                System.out.println("Invalid input, exiting the game.");
                doneInput = true;
            }
        } while (!doneInput);

        System.out.println("Thanks for playing!");
        in.close();
    }
}