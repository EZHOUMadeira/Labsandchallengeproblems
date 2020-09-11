package Madeira.cs;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Author:Ellie Zhou
 * Date: 9/8/2020
 * Lab1
 **/

public class Main {

    private static Object Scanner;

    public static void main(String[] args) {

        String myString1 = "Hi";
        System.out.println(myString1);
        myString1 = "bye";
        System.out.println(myString1);

        String myString2 = "I am Ellie";
        System.out.println(myString2);
        myString2 = "I am Aashna";
        System.out.println(myString2);

        String myString3 = "I AM FROM BEIJING";
        System.out.println(myString3);
        myString3 = "I AM FROM SHANGHAI";
        System.out.println(myString3);


        System.out.println("Hi" + "Ellie");

        System.out.println(myString1.charAt(1));

        String myString3lower = myString3.toLowerCase();
        System.out.println(myString3lower);





        /*
        Lab2
        Author: Ellie Zhou
        Date: 9/10
        */


        Scanner myScanner = new Scanner(System.in);
        String myScannedInput = myScanner.nextLine();
        System.out.println("Greetings, "+myScannedInput);

        Scanner myScanner1 = new Scanner(System.in);
        String myScannedInput1 = myScanner.nextLine();
        System.out.println(myScannedInput1);
        System.out.println("One call away, "+myScannedInput1);

        Scanner myScanner2 = new Scanner(System.in);
        String myScannedInput2 = myScanner.nextLine();
        System.out.println(myScannedInput2);
        System.out.println("5666 days, "+myScannedInput2);




        /**
         * Challenge problems
         * Author: Ellie Zhou
         * 9/10
         */

        /*
        ProblemI
         */

        String myStringfirstname = "Huamei";
        String myStringenglishname = "Ellie";
        String myStringlastname = "Zhou";
        System.out.println(myStringfirstname+" "+myStringenglishname+" "+myStringlastname);

        /*
        ProblemII
         */

        String myString4 = "Hello";
        String myString5 = "World";
        System.out.format(myString4);
        System.out.format(myString5);

        /*
        ProblemIII
         */


        Scanner myScanner4 = new Scanner(System.in);
        int myScannedInputage = myScanner4.nextInt();
        int counter = 2020;
        counter = counter - myScannedInputage;
        System.out.println("You are " + counter + " years old.");


        /*
        Problem IV
         */


        Scanner myScanner5 = new Scanner(System.in);
        String myScannedInput3 = myScanner5.nextLine();
        if (myScannedInput3.equals("Ellie")) {
            System.out.println(myScannedInput3 + "--first name.");
        } else {
            System.out.println(myScannedInput3 + "--last name.");
        }

        Scanner myScanner6 = new Scanner(System.in);
        String myScannedInput4 = myScanner6.nextLine();
        if (myScannedInput4.equals("Zhou")) {
            System.out.println(myScannedInput4 + "--last name.");
        } else {
            System.out.println(myScannedInput4 + "--first name.");
        }



        /*
        Problem V
         */

        int i = 0;
        int x = 3;
        int j = 2;
        boolean b = false;
        b = j % x == i;
        System.out.print(b);


        /*
        Problem VI
         */


        Scanner myScanner7 = new Scanner(System.in);
        int myScannedInput5 = myScanner7.nextInt();
        int counter1 = 2020;
        counter1 = counter1 - myScannedInput5 + 5;
        System.out.println("You are " + counter1 + " years old 5 years later.");

        /*
        Problem VII


        Scanner myScanner8 = new Scanner(System.in);
        System.out.println("type your first number");
        int number = 2;
        int myScannedInput6 = myScanner8.nextInt();
        int result = myScannedInput6 / number;
        Scanner myScanner13 = new Scanner(System.in);
        System.out.println("type you second number");
        double counter3 = 2.5;
        int result1 = myScannedInput6 /




        /*
        Problem VIII
         */
        Scanner myScanner9 = new Scanner(System.in);
        String myScannedInput7 = myScanner9.nextLine();
        if (myScannedInput7.equals("Ellie")) {
            System.out.println(myScannedInput7 + "--success.");
        }

        Scanner myScanner10 = new Scanner(System.in);
        String myScannedInput8 = myScanner10.nextLine();
        if (myScannedInput8.equals("Elizabeth")) {
            System.out.println(myScannedInput8 + "--false");
        }

        Scanner myScanner11 = new Scanner(System.in);
        String myScannedInput9 = myScanner11.nextLine();
        if (myScannedInput9.equals("Jane")) {
            System.out.println(myScannedInput8 + "--false");
        }

            /*
            Problem IX
             */


    /*
    ProblemX
     */
        Scanner myScanner12 = new Scanner(System.in);
        int myScannedInput10 = myScanner12.nextInt();

        System.out.println();


        // write your code here
    }
}


