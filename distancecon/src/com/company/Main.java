package com.company;

import com.sun.org.apache.xpath.internal.functions.FuncTrue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Getting user input and creating variables

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a hour:");
        String hour = console.nextLine();
        System.out.println("Enter a number of minutes:");
        String minutes = console.nextLine();
        System.out.println("Enter a number of seconds");
        String seconds = console.nextLine();
        System.out.println("AM or PM?");
        String ampm = console.nextLine();

        //AM or PM?
        //+12 to variables
        //Print

        if (ampm.equals("PM")) {
            Integer pmHour = Integer.parseInt(hour);

            if (pmHour <= 12) {
                Integer HourInt = (pmHour + 12);
                String HourString = String.valueOf(HourInt);
                System.out.print (HourString );
                System.out.print (":");
                System.out.print (minutes);
                System.out.print (":");
                System.out.print (seconds);
            }
        }

        else if (ampm.equals("AM")) {
            System.out.print (hour);
            System.out.print (":");
            System.out.print (minutes);
            System.out.print (":");
            System.out.print (seconds);

        }
    }
}
