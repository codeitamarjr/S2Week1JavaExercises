package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hi, What`s the name of the first player?");
        Scanner keyboard = new Scanner(System.in);
        String player1 = keyboard.nextLine();
        System.out.println("Welcome "+player1);
        System.out.println("Try guess the number");
        int guessUser = keyboard.nextInt();
        int scorePlayer1 = GuessNumber.guessNumber(guessUser);

        System.out.println("Hi, What`s the name of the second player?");
        Scanner keyboard2 = new Scanner(System.in);
        String player2 = keyboard2.nextLine();
        System.out.println("Welcome "+player2);
        System.out.println("Try guess the number");
        int guessUser2 = keyboard2.nextInt();
        int scorePlayer2 = GuessNumber.guessNumber(guessUser2);

        System.out.println(player1+" tried "+ scorePlayer1);
        System.out.println(player2+" tried "+ scorePlayer2);
        String winnerPlayer;
        if (scorePlayer1<scorePlayer2){
            winnerPlayer = player1;
        } else {
            winnerPlayer = player2;
        }
        System.out.println("Congratulations "+winnerPlayer+", you won!");
    }
}
