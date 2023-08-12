/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
 class GuessingGame
{
    private int randNumber;
    private int noOfAttempts = 0;
    private int inputNumber;
    private int maxNoOfAttempts = 10;

public int getnoOfAttempts(){
    return noOfAttempts;
}
public void setnoOfAttempts(int noOfAttempts){
    this.noOfAttempts=noOfAttempts;
}
GuessingGame(){
    Random randNumber = new Random();
    this.randNumber = randNumber.nextInt(100);
}
public void takeUserInput(){
    System.out.print("GuessNo.:");
    Scanner sc = new Scanner(System.in);
    inputNumber = sc.nextInt();
}
public boolean isCorrectNumber(){
    noOfAttempts++;
    
    if(inputNumber==randNumber){
        System.out.println("correct , you have guessesd it right in "+noOfAttempts+"  attempts");
        System.out.println("Score is : "+(10-noOfAttempts));
        return true;
    }
    else if(noOfAttempts>=maxNoOfAttempts){
        System.out.println("Sorry, you have reached the max No Of Attempts");
        System.out.println("The number was : "+randNumber);
    }
    else if(inputNumber<randNumber){
        System.out.println("too low , keep it high");
    }
    else if(inputNumber>randNumber){
        System.out.println("too high , keep it low");
    }
    return false;
}
public void playAgain(){
     boolean b = false ;
      GuessingGame g = new GuessingGame();
    while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
}
}
}
public class Guesstheno {
public static void main(String[] args) {
    GuessingGame g = new GuessingGame();
g.playAgain();
}
}
