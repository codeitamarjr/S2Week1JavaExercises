package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Guess game!\nWhat`s the name of the first player?");
        Scanner keyboard = new Scanner(System.in);
        String player1Name = keyboard.nextLine();
        System.out.println("Welcome "+player1Name);
        System.out.println("Try guess the number");
        int guessUser = keyboard.nextInt();
        int scorePlayer1 = GuessNumber.guessNumber(guessUser);

        System.out.println("Hi, What`s the name of the second player?");
        Scanner keyboard2 = new Scanner(System.in);
        String player2Name = keyboard2.nextLine();
        System.out.println("Welcome "+player2Name);
        System.out.println("Try guess the number");
        int guessUser2 = keyboard2.nextInt();
        int scorePlayer2 = GuessNumber.guessNumber(guessUser2);

            //The win message
        ScoreSystem.printScore(scorePlayer1,scorePlayer2,player1Name,player2Name);

    }
}
