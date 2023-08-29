package Assignment_3;

import java.util.Scanner;

/* Enhance the Guesser Game Project which you have learnt in live class. Add the
maximum feature you could add to it.*/

import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser, kindly guess the number (1-10):");
        guessNum = getValidGuess(scan);

        return guessNum;
    }

    private int getValidGuess(Scanner scan) {
        int validGuess;
        do {
            validGuess = scan.nextInt();
            if (validGuess < 1 || validGuess > 10) {
                System.out.println("Invalid guess! Kindly guess within the range 1-10:");
            }
        } while (validGuess < 1 || validGuess > 10);
        return validGuess;
    }
}

class Player {
    int guessNum;

    int guessNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player, kindly guess the number (1-10):");
        guessNum = getValidGuess(scan);

        return guessNum;
    }

    private int getValidGuess(Scanner scan) {
        int validGuess;
        do {
            validGuess = scan.nextInt();
            if (validGuess < 1 || validGuess > 10) {
                System.out.println("Invalid guess! Kindly guess within the range 1-10:");
            }
        } while (validGuess < 1 || validGuess > 10);
        return validGuess;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();
    }

    void compare() {
        int count = 0;
        if (numFromGuesser == numFromPlayer1) {
            count++;
        }
        if (numFromGuesser == numFromPlayer2) {
            count++;
        }
        if (numFromGuesser == numFromPlayer3) {
            count++;
        }

        if (count == 0) {
            System.out.println("Game lost! Try Again!");
        } else {
            System.out.println("Player(s) won the game:");
            if (numFromGuesser == numFromPlayer1) {
                System.out.println("Player 1");
            }
            if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 2");
            }
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 3");
            }
        }
    }
}

public class EnhancedGuesserGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char playAgain;

        do {
            Umpire u = new Umpire();
            u.collectNumFromGuesser();
            u.collectNumFromPlayers();
            u.compare();

            System.out.println("\nDo you want to play again? (y/n):");
            playAgain = scan.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');
    }
}
