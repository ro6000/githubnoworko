package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        //Create the following functions.

        //Function Name: MyPrintFunction
        //Inputs: none
        //What it should do: Print the message: "In MyPrintFunction"
        //Returns: nothing
        MyPrintFunction();

        //Function Name: BobPrinter
        //Inputs: none
        //What it should do: Print the message: "bob bob bob bob bob"
        //Returns: nothing
        BobPrtiner();



        //Function Name: Add
        //Inputs: 2 integers (num1 and num2)
        //What it should do: add num1 and num2
        //Returns: the integer that is result of adding num1 and num2 together
        int varC = Add(3,3);
        System.out.println(varC);
        varC = Add(5,3);
        System.out.println(varC);
        varC = Add(78,43);
        System.out.println(varC);

        //Function Name: Sub
        //Inputs: 2 integers (num1 and num2)
        //What it should do: subtract num2 from num1
        //Returns: the integer that is result of subtracting num2 from num1
        int varD = Sub(4,3);
        System.out.println (varD);
        varD = Sub(24,22);
        System.out.println (varD);
        varD = Sub(37,22);
        System.out.println (varD);


        //Function Name: Add1
        //Inputs: 1 integer
        //What it should do: add 1 to the integer
        //Returns: the new integer
        int varE = Add1(9);
        System.out.println(varE);
        varE = Add1(93);
        System.out.println(varE);
        varE = Add1(22);
        System.out.println(varE);



//In the main function call each of these functions for the function with inputs call them with 3 different inputs to show you tested the code.
//If the function returned a value you should print it to the screen
    }

    private static void MyPrintFunction(){
        System.out.println ("In MyPrintFunction");
    }
    private static void BobPrtiner(){
        System.out.println ("bob bob bob bob bob");
    }

    static int Add(int A, int B) {
        int C = (A+B);

        return C;
    }

    static int Sub(int A, int B) {
        int C = (A-B);

        return C;
    }

    static int Add1(int A) {
        int C = (A+1);

        return C;
    }



}
