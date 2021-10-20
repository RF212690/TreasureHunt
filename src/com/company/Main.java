package com.company;

import org.omg.CORBA.Object;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static int[][] board;

    static void Board(int length, int width) {

        Random random = new Random();
        Object[] output = new Object[2];

        int rand = random.nextInt(length * width / 2);
        for (int i = 0; i < rand; i++) {
            board[random.nextInt(length)][random.nextInt(width)] = random.nextInt(150) + 51;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("select length of the board");
        int length = input.nextInt();
        System.out.println("select width of the board");
        int width = input.nextInt();
        board =new int[length][width];

        Board(length, width);

        System.out.println("Where are the coins?");


    }
}
