/*
 * 
 * Group Members: Jack Dalton, Juan Robledo, Ben Stewart
 * Assignment: Exploration One
 * Instructor: Becnel
 * Course: 3342 - 001
 * Date: 2/8/2024
 * 
 * Objective: Create two algorithms using the recursive 
 * and iterative methods to be compared using the 
 * file Test.java
 * 
 * Equation to compare:
 * f(0) = 0
 * f(1) = 2
 * f(2) = 4
 * F(n) = F(n - 1) + nF(n - 2) - 2F(n - 3) + 5
 */

public class Compare {

    public static int recursiveF(int n) {
        if (n == 0) {
            return 0; // base case a
        } else if (n == 1) {
            return 2; // base case b
        } else if (n == 2) {
            return 4; // base case c
        } else {
            // for all values n > 3 uses references to previous values
            return recursiveF(n - 1) + (n * recursiveF(n - 2)) - (2 * recursiveF(n - 3)) + 5;
        }
    }// end recF

    public static int iterativeF(int n) {
       // create variables to hold base cases
       int fZero = 0;
       int fOne = 2;
       int fTwo = 4;

       //set values for if base case is passed in 
       // copied from recursiveF
       if (n == 0) {
        return 0; // base case a
    } else if (n == 1) {
        return 2; // base case b
    } else if (n == 2) {
        return 4; // base case c
    }

    //function > 2 so we can start w
    // the values at 3 and build up to 
    // the answer. 
    // This is a note bc I solved w an array
    // but rewrote it without. 
    int value = 0;

    for(int i = 3; i <= n; i++){
        value = fTwo + (i * fOne) - (2 * fZero) + 5;
        fZero = fOne;
        fOne = fTwo;
        fTwo = value;
        
    }// end for loop

    return value;
    }// end iterF
}
