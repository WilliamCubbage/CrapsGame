import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain)
        {
            System.out.println("Let's play Craps, press any key to roll the dice!"); //Intro Message
            in.nextLine(); // Wait for a key to be pressed to begin game

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("You rolled a " + die1 + " and a " + die2 + ". The sum is " + sum);

            if (sum == 7 || sum == 11) {
                System.out.println("You win!");
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose!");
            } else {
                int point = sum;
                System.out.println("Your Point is " + point);


                while (true) {
                    System.out.println("Press any key to roll again!");
                    in.nextLine();

                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("You rolled a " + die1 + " and a " + die2 + ". The sum is " + sum);

                    if (sum == point) {
                        System.out.println("You win!");
                        break;
                    } else if (sum == 7) {
                        System.out.println("You Lose!");
                        break;
                    }

                }
            }
            System.out.println("Next player press any key to start your turn!");
            in.nextLine();
        }
    }
}