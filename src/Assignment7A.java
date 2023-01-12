//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment7A {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intInput;
        String strInput;
        boolean boolStop = false;

        //initial output and create FSA
        System.out.print("[Finite State Automata]\nWhat state do you want to start at? ");
        intInput = scan.nextInt();
        FSA fsa = new FSA(intInput);
        System.out.println("");
        //IDK why but this is the only way I can get strInput to work on the first try of the while loop
        strInput = scan.nextLine();


        while (!boolStop) {
            System.out.println("What will you do?\n-Go to next state\n-End");
            strInput = scan.nextLine();
            if(strInput.equals("Go to next state")) {
                System.out.println("\nYou're now at state " + fsa.goToNextState());
            }
            else if (strInput.equals("End")) {
                if (fsa.end()) {
                    boolStop = true;
                }
                else {
                    System.out.println("\nYou can't stop here; you can only stop at state 3.");
                }
            }
            else {
                System.out.println("\nInvalid command");
            }
        }


    }
}