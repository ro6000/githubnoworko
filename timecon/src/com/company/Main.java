package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Getting user input and creating variables

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a hour:");
        String hour = console.nextLine();
        Integer intHour = Integer.parseInt(hour);
        if (intHour > 12){
            System.out.println("You're a loser");
            return;}
        System.out.println("Enter a number of minutes:");
        String minutes = console.nextLine();
        Integer intMin = Integer.parseInt(minutes);

        System.out.println("Enter a number of seconds");
        String seconds = console.nextLine();
        Integer intSec = Integer.parseInt(seconds);


        System.out.println("AM or PM?");
        String ampm = console.nextLine();

        //AM or PM?
        //+12 to variables
        //Print

        if (ampm.equals("PM")) {
            if (intHour < 12) {
                intHour = intHour + 12;
                //System.out.print (HourInt );
                //System.out.print (":");
                //System.out.print (minutes);
                //System.out.print (":");
                //System.out.print (seconds);
            }
        } else {
            if (intHour == 12) {
                intHour = 0;
            }

        }

        if (intHour < 10) {
            System.out.print("0" + intHour);
        } else {
            System.out.print(intHour);
        }

        System.out.print(":");

        if (intMin < 10) {
            System.out.print("0" + intMin);
        } else {
            System.out.print(minutes);
        }

        System.out.print(":");

        if (intSec < 10) {
            System.out.print("0"+intSec);
        } else {
            System.out.print(seconds);

        }
    }
}