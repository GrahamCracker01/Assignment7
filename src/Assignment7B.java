//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
import java.util.Random;
class Assignment7B {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        FSA [] array1;
        array1  = new FSA [3];
        int intRandom;
        String strInput;
        boolean boolStop = false;
        int intInput;

        //initial output and initialize array and objects
        System.out.println("[Array of Finite State Automata]");
        for (int i = 0; i < 3; i++) {
            intRandom = rand.nextInt(3);
            array1[i] = new FSA (intRandom);
            System.out.println("Machine #" + i + " is starting at state " + array1[i].showCurrentState());
        }
        System.out.println("");

        //main loop
        while (!boolStop) {
            System.out.println("What will you do?\n-Check the current status\n-Go to next state\n-End");
            strInput = scan.nextLine();

            //status check
            if (strInput.equals("Check the current status")) {
                System.out.print("What machine will you look at? ");
                intInput = scan.nextInt();
                if (array1[intInput].isActive() == false) {
                    System.out.println("\nMachine #" + intInput + " is not active\n");
                }
                else {
                    System.out.println("\nMachine #" + intInput + " is active and at state " + array1[intInput].showCurrentState() + "\n");

                }
                strInput = scan.nextLine();
            }

            //advance state
            else if (strInput.equals("Go to next state")) {
                System.out.print("What machine will you advance? ");
                intInput = scan.nextInt();
                if (array1[intInput].isActive() == false) {
                    System.out.println("\nMachine #" + intInput + " is not active\n");
                }
                else {
                    System.out.println("\nMachine #" + intInput + " is now at state " + array1[intInput].goToNextState() + "\n");

                }
                strInput = scan.nextLine();
            }

            //end
            else if (strInput.equals("End")) {
                if (array1[0].isActive() == false && array1[1].isActive() == false && array1[2].isActive() == false) {
                    System.out.println("All machines have been turned off.");
                    boolStop = true;
                }
                else {
                    System.out.print("What machine will you stop? ");
                    intInput = scan.nextInt();
                    if (array1[intInput].isActive() == false) {
                        System.out.println("Machine #" + intInput + " is not active");
                    }
                    else {
                        if (array1[intInput].end() == true) {
                            System.out.println("\nMachine #" + intInput + " is now deactivated\n");
                        } else {
                            System.out.println("\nYou can't stop here; you can only stop at state 3.\n");
                        }
                    }
                    strInput = scan.nextLine();
                }
            }

            //default
            else {
                System.out.println("\nInvalid command");
            }
        }

    }
}