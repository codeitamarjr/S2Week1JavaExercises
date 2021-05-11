package com.company;
public class ScoreSystem {
    public static void printScore(int scorePlayer1, int scorePlayer2, String player1Name, String player2Name) {
        System.out.println(player1Name+" tried "+ scorePlayer1);
        System.out.println(player2Name+" tried "+ scorePlayer2);
        String winnerPlayer;
        if (scorePlayer1 == scorePlayer2) {
            System.out.println("Both has the same score :D");
        } else if (scorePlayer1 < scorePlayer2) {
            winnerPlayer = player1Name;
            System.out.println("Congratulations " + winnerPlayer + ", you won!");
        } else {
            winnerPlayer = player2Name;
            System.out.println("Congratulations " + winnerPlayer + ", you won!");
        }
    }
}
