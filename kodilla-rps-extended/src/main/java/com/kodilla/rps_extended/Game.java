package com.kodilla.rps_extended;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class Game {
    int end = 1;

    public void launchGame(int scannedNumberOfRounds) {
        int sumPlayer = 0;
        int sumPC = 0;
        System.out.println("\n");

        while (end < scannedNumberOfRounds + 1) {
            System.out.println("Round #" + end);
            System.out.println("Choose rock, paper, scissors, lizard or spock");
            Scanner scanRPS = new Scanner(System.in);
            String chosenRPS = scanRPS.nextLine();

            //random numbers generator
            int randomInt = ThreadLocalRandom.current().nextInt(0, 4 + 1);

            //options of play, computer choose 0
            if (randomInt == 0 && chosenRPS.equals("rock")){
                System.out.println("Computer choose rock\nIt's draw!");
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 0 && chosenRPS.equals("scissors")){
                System.out.println("Computer choose rock\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 0 && chosenRPS.equals("paper")){
                System.out.println("Computer choose rock\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 0 && chosenRPS.equals("lizard")){
                System.out.println("Computer choose rock\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 0 && chosenRPS.equals("spock")){
                System.out.println("Computer choose rock\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            //options of play, computer choose 1
            if (randomInt == 1 && chosenRPS.equals("rock")){
                System.out.println("Computer choose paper\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 1 && chosenRPS.equals("scissors")){
                System.out.println("Computer choose paper\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 1 && chosenRPS.equals("paper")){
                System.out.println("Computer choose paper\nIt's draw!");
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 1 && chosenRPS.equals("lizard")){
                System.out.println("Computer choose paper\nYou Win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 1 && chosenRPS.equals("spock")){
                System.out.println("Computer choose paper\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            //options of play, computer choose 2
            if (randomInt == 2 && chosenRPS.equals("rock")){
                System.out.println("Computer choose scissors\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 2 && chosenRPS.equals("scissors")){
                System.out.println("Computer choose scissors\nIt's draw!");
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 2 && chosenRPS.equals("paper")){
                System.out.println("Computer choose scissors\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 2 && chosenRPS.equals("lizard")){
                System.out.println("Computer choose scissors\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 2 && chosenRPS.equals("spock")){
                System.out.println("Computer choose scissors\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            //options of play, computer choose 3
            if (randomInt == 3 && chosenRPS.equals("rock")){
                System.out.println("Computer choose lizard\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 3 && chosenRPS.equals("scissors")){
                System.out.println("Computer choose lizard\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 3 && chosenRPS.equals("paper")){
                System.out.println("Computer choose lizard\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 3 && chosenRPS.equals("lizard")){
                System.out.println("Computer choose lizard\nIt's draw!");
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 3 && chosenRPS.equals("spock")){
                System.out.println("Computer choose lizard\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            //options of play, computer choose 4
            if (randomInt == 4 && chosenRPS.equals("rock")){
                System.out.println("Computer choose spock\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 4 && chosenRPS.equals("scissors")){
                System.out.println("Computer choose spock\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 4 && chosenRPS.equals("paper")){
                System.out.println("Computer choose spock\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 4 && chosenRPS.equals("lizard")){
                System.out.println("Computer choose spock\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 4 && chosenRPS.equals("spock")){
                System.out.println("Computer choose spock\nIt's draw!");
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            //bad answer
            /*if (!chosenRPS.equals("paper") ||
                    !chosenRPS.equals("scissors") ||
                    !chosenRPS.equals("paper")){
                System.out.println("You need to write correct figure");
            }*/

            //end of game
            if (chosenRPS.equals("X") ||
                    chosenRPS.equals("x")){
                System.out.println("Are You shure, You want to end game?");
                Scanner scanYOrN = new Scanner(System.in);
                String chosenYOrN = scanYOrN.nextLine();

                if (chosenYOrN.equals("Y") ||
                        chosenYOrN.equals("y")){
                    end = scannedNumberOfRounds + 1;
                }
                else {
                    System.out.println("Let's resume the game");
                }
            }

            //new game
            if (chosenRPS.equals("N") ||
                    chosenRPS.equals("n")) {
                System.out.println("Are You shure, You want start a new game? You will lose actual score");
                Scanner scanYOrN = new Scanner(System.in);
                String chosenYOrN = scanYOrN.nextLine();

                if (chosenYOrN.equals("Y") ||
                        chosenYOrN.equals("y")) {
                    end = 1;
                    sumPC = 0;
                    sumPlayer = 0;
                }
                else {
                    System.out.println("Let's resume the game");
                }
            }

            String sumPlayerString = Integer.toString(sumPlayer);
            String sumPCString = Integer.toString(sumPC);
            String result = sumPCString + " : " + sumPlayerString;
        }
        System.out.println("That's all. Final score of " + (end - 1) + " rounds is " + max(sumPC, sumPlayer) + " to " + min(sumPC, sumPlayer) + "\n");
        if (sumPC > sumPlayer){ System.out.println("Computer win, maybe next time"); }
        if (sumPC < sumPlayer){ System.out.println("Congrats, You win!"); }

        System.out.println("What do You want to do now?\n(press 'x' to end, press 'n' to start a new game");
        Scanner scanYOrN = new Scanner(System.in);
        String chosenYOrN = scanYOrN.nextLine();
        if (chosenYOrN.equals("n") || chosenYOrN.equals("N")){
            end = 1;
            sumPC = 0;
            sumPlayer = 0;
        }
        if (chosenYOrN.equals("x") || chosenYOrN.equals("X")) { end = scannedNumberOfRounds + 1; }
        System.out.println("\nBye bye ;-)");
    }
}