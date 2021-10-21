package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[][] board;

    static int Coins(int length, int width) {

        Random random = new Random();
        int rand = random.nextInt(length * width / 2);
        for (int i = 0; i < rand; i++) {
            board[random.nextInt(length)][random.nextInt(width)] = random.nextInt(150) + 51;
        }
        return rand;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("select heigth of the board");
        int height = input.nextInt();

        System.out.println("select width of the board");
        int width = input.nextInt();

        board = new int[height][width];
        int treasures = Coins(height, width);

        System.out.println("Find the treasures!");
        boolean bored = false;
        int coins = 0;
        while (!bored && treasures > 0) {
            System.out.println("There is a total of " + treasures + " treasures left on the board");
            System.out.println("Insert the coordinates of where you think there could be a treasure(height)");
            int theight = input.nextInt();
            while (theight >= height) {
                System.out.println("value inserted is too high.");
                theight = input.nextInt();
            }
            System.out.println("Insert the coordinates of where you think there could be a treasure(width)");
            int twidth = input.nextInt();
            while (twidth >= height) {
                System.out.println("value inserted is too high.");
                twidth = input.nextInt();
            }
            if (board[theight][twidth] > 0) {
                treasures--;
                coins = coins + board[theight][twidth];
                board[theight][twidth] = 0;
                System.out.println("Correct! you have a total of " + coins + " coins now");
            } else {
                System.out.println("Wrong! there is no treasure here");
            }
            System.out.println("If you dont want to keep playing press n");
            String exit = input.next();
            if (exit.equalsIgnoreCase("n")) {
                bored = true;
                System.out.println("Your had a total of " + coins + " coins and there were " + treasures + " treasures left undiscovered");
            }


        }

    }
}

        System.out.println("Where are the coins?");


    }
}
