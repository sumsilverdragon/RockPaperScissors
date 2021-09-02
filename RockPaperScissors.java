/* this program is a simple game of rock,paper,scissors against the computer
    using random number generator to assign computer's play
    and comparing the user and computer's choices with conditional statements
 */

//import necessary libraries
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        //scanner declaration
        Scanner scanner = new Scanner(System.in);

        //run the program in a while loop until the user wants to quit
        while (true) {

            //create string-list variable to use for computer's random choice of an element of the list
            String[] rps = {"r", "p", "s"};
            //get computer move equal to an element of the rps-list, using a random generated number with Random()
            //passing in the length of the rps-list as the range
            String computerMove = rps[new Random().nextInt(rps.length)];

            //get player move with user input
            //declare playerMove to string variable
            String playerMove;

            //put player input in while loop to ensure player enters r,p,s to continue
            while (true) {
                System.out.println("Please enter your move (r,p, or s)");
                playerMove = scanner.nextLine();
                //break while loop if r,p,s was inputted
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                //print error message if incorrect input
                System.out.println(playerMove + " is not a valid move.");
            }
            //display computer generated move
            System.out.println("Computer played: " + computerMove);

            //display result if computer's move is the same as player's move, the game is a tie
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            }
            //if not a tie, compare to other possible computer moves and display results
            else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose!");

                } else if (computerMove.equals("s")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("You win!");

                } else if (computerMove.equals("s")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println("You win!");

                } else if (computerMove.equals("r")) {
                    System.out.println("You lose!");
                }
            }

            //ask user to play again or quit
            System.out.println("Play again? (y/n)");
            //declare string for what user inputs on next line
            String playAgain = scanner.nextLine();

            //if user does not want to play again, break the loop
            if (!playAgain.equals("y")) {
                break;
            }
        }
        //close scanner
        scanner.close();
    }
}
