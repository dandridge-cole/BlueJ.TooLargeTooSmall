
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class Main
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        int min =1;
        int max =50;
        int theAnswer;
        Random myRandom = new Random();
        theAnswer=(int)myRandom.nextInt((max-min+1)+1);
        //int x = (int)(Math.random()*(max-min+1))+1;
        System.out.print("I'm thinking of a number between \n "+min+" and "+max+" -- guess!"/*" (it's "+theAnswer+")"*/);
        int numGuesses = guessingGame(theAnswer); 
        System.out.println("You got it! it was "+theAnswer+". It took you "+numGuesses+" guesses.");
        
        
    }

    public int guessingGame(int y)
    {
        // put your code here
        int guessCounter=1;
        Scanner myInput = new Scanner(System.in);
        int guess = myInput.nextInt();
        int lastGuess;
        while(guess!=y){
            lastGuess=guess;
            if(guess>y){
                System.out.print("Too high! Guess again:");
            }else{
                System.out.print("Too low! Guess again:");
            }
            myInput = new Scanner(System.in);
            guess= myInput.nextInt();
            if(guess==lastGuess){
                System.out.print("That\'s the same number! ");
            } else {
           guessCounter++; 
        }
        }
        return guessCounter;
    }
}
