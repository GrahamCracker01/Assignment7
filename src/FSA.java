//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class FSA {

    int state;
    boolean active;

    public FSA(int i) {
        if (i < 0 || i > 3) {
            state = 0;
            System.out.println("This is an invalid state. Starting at state 0");
        }
        else {
            state = i;
        }
        active = true;
    }

    public int goToNextState() {
        if (state < 3) {
            state++;
        }
        else {
            state = 0;
        }
        return state;
    }

    public boolean end() {
        if (state == 3) {
            active = false;
            return true;
        }
        else {
            return false;
        }
    }

    public int showCurrentState() {
        return state;
    }

    public boolean isActive() {
        return active;
    }
}