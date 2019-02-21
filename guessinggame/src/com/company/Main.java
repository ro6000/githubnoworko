package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            int i = 0;

            int secretNum = GenNum();//initaites the function to generate a number
            while (true) {
                int userGuess = GetGuess();//number to start guessing
                i = i + 1;//keeps track of guesses
                if (CheckGuess(secretNum, userGuess) == false) {//checking if guess was correct
                    continue;

                } else {
                    System.out.println("Correct!");
                    System.out.println(" You guessed " + i + " times.");//informs the user of the guess
                    break;
                }
            }
            String playAgain = Input( "Play again?");//replay prompt

            if (playAgain.equals("yes")) {//replay prompt answer to replay again
                continue;

            } else {
                System.exit(0);//replay, if not yes, will exit out of it

            }

        }



    }
    /*Write a guessing game where the user has to guess a secret number, create and use the functions described below for credit.
    Keep track of number of guesses
    You must use the functions below to recieve credit
    All of the functions below should be used in your solution
    (some may only be used by other functions others will be used in the main functionYour guessing game needs to include the following:
    Allow the user to enter their name.Keep track of the number of guesses it takes to get it right
    Generate a random number between 1-100 for the user to guess
    .once the user guesses the correct number ask if they would like to play again,
     exiting if they type "no" restarting if they type"yes"*/


    //This program needs the following functions:
    //Function Name: Input
    //Inputs: string to be used as a prompt
    //What it should do:
    //Print the prompt to the screen
    //get input from the user
    //Returns: string containing what the user entered
    static String Input(String prompt){
        Scanner console = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = console.nextLine();
        return userInput;

    }

    //Function Name: IntInput
    //Inputs: string to be used as a prompt
    //What it should do: Print the prompt to the screen (use the input function created above)
    //get input from the user
    //this should continue to reprompt the user and get new input until an integer is entered by the user
    //Returns: the integer that the user entered

    static int IntInput(String prompt){

        int userinput;
        while(true){

            try {
                userinput = Integer.parseInt(Input(prompt));
            }
            catch(NumberFormatException ex){
                System.out.println("Not a number ");
                continue;
            }
            return userinput;
        }
    }

    //Function Name: GenerateNumber
    //Inputs: none
    //What it should do:
    //generate random number between 1 and 100  - see bottom of page for how to do this
    //Returns: the number generated

    static int GenNum (){
        Random rand = new Random();
        int  theSecretNumber = rand.nextInt(100) + 1;
        return theSecretNumber;
    }


    //Function Name: GetGuess
    //Inputs: none
    //What it should do:
    //prompt the user to guess a number between 1 and 100 (use IntInput you created to do this.
    //while the number returned by the function is not valid have it reask for a number
    //Returns: the number the user entered (should be valid integer between 1-100 at this point)

    static int GetGuess() {
        while (true) {
            int userinput = IntInput("Guess a number between 1 and 100.");
            if (userinput > 100 || userinput < 1) {
                continue;
            }
            return userinput;
        }
    }

    //Function Name: printHint
    //Inputs: theSecretNumber, userGuessedNumber
    //What it should do:if userGuessedNumber is less than theSecretNumber
    //print your number was too small
    //else if userGuessedNumber is greater than theSecretNumber
    //print your number was too large
    //Returns: nothing

    static void printHint (int theSecretNumber, int userGuessedNumber){

        if (userGuessedNumber<theSecretNumber){
            System.out.println("Your number was too small.");
        }
        else if(userGuessedNumber>theSecretNumber){
            System.out.println("Your number was too large.");
        }

    }

    //Function Name: CheckGuess
    //Inputs: theSecretNumber, userGuessedNumber
    //What it should do:
    //check to see if the number the userGuessedNumber was != or == to theSecretNumber
    //if theSecretNumber was != userGuessedNumber then call PrintHint
    //Returns: boolean indicating if it was a match or not

    static boolean CheckGuess(int theSecretNumber, int userGuessedNumber){
        if (userGuessedNumber!= theSecretNumber){
            printHint(theSecretNumber, userGuessedNumber);
            return false;
        }
        else{
            return true;
        }
    }


    //*To Create a Random Number between 1 and 100 in Java:
    //import java.util.Random;
    // this needs to be at the top of the code where other imports are
    //Random rand = new Random();
    //int  n = rand.nextInt(100) + 1;
    //100 is the maximum and the 1 is our minimum


}



//PLay again works, replays and takes out of code
//it's randomized each time
//words don't break it
