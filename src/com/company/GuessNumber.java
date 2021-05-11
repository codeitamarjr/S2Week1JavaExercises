package com.company;
import java.util.Scanner;

public class GuessNumber{
    public static int guessNumber(int guessUser){

        int randomWiningNumber = 1+(int)(Math.random()*100);
        int countGuess = 0; // Just to count how much times the user try guessed the number
        Scanner keyboard = new Scanner(System.in);

        while (guessUser != randomWiningNumber){
            if( guessUser > randomWiningNumber) {
                System.out.println("Your number is greater than my number, try again:");
                guessUser = keyboard.nextInt();
                countGuess++;
            } else {
                    System.out.println("Your number is less than my number, try again:");
                    guessUser = keyboard.nextInt();
                    countGuess++;
            }
        }

        System.out.println("You guessed the number: "+randomWiningNumber+", you tried "+countGuess+" times.");
        return countGuess;
    }
}