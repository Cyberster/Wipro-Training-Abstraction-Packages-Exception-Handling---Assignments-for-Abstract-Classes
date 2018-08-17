/*
 * Create an abstract class Compartment to represent a rail coach. Provide an abstract 
 * function notice in this class. Derive FirstClass, Ladies, General, Luggage classes 
 * from the compartment class. Override the notice function in each of them to print notice 
 * suitable to the type of the compartment.
 * Create a class TestCompartment . Write main function to do the following:
 * Declare an array of Compartment of size 10.
 * Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
 * Check the polymorphic behavior of the notice method.
 * */

package com.w3epic.wiprotraining.assignment2;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] compartments = new Compartment[10];

		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((4 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		compartments[i] = new FirstClass();
	    	else if (randomNum == 2)
	    		compartments[i] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[i] = new General();
	    	else if (randomNum == 4)
	    		compartments[i] = new Luggage();
	    	
	    	compartments[i].notice();
	    }
	}

}
