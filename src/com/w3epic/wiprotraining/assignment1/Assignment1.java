/*
 * 1.1. Create a class called GeneralBank which acts as base class for all banks. 
 * This class has functionality getSavingInterestRate and getFixedInterestRate methods, 
 * which return the saving a/c rate of interest and fixed account rate of interest the 
 * specific bank gives. Since GeneralBank cannot say what percentage which bank would give, 
 * make it abstract.
 * 
 * 	1.2. Create 2 subclasses of GeneralBank called ICICIBank and KotMBank. Override the methods 
 * from base class. ICICI - Savings 4% Fixed 8.5% and KotMBank.  - Savings 6% Fixed 9%
 * 	1.3. Create a main method to test the above classes. Try one by one and absorb your finding.
 * 		a) ICICIBank object reference instantiated with ICICIBank class.
 * 		b) KotMBank object reference instantiated with KotMBank class.
 * 		c) GeneralBank object reference instantiated with KotMBank class.
 * 		d) GeneralBank object reference instantiated with ICICIBank class.
 * */

package com.w3epic.wiprotraining.assignment1;

public class Assignment1 {

	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();

		System.out.println(iciciBank.getSavingInterestRate());
		System.out.println(iciciBank.getFixedInterestRate());
		System.out.println(kotMBank.getSavingInterestRate());
		System.out.println(kotMBank.getFixedInterestRate());
		
		GeneralBank gb1 = new ICICIBank();
		GeneralBank gb2 = new KotMBank();
		
		System.out.println(gb1.getSavingInterestRate());
		System.out.println(gb1.getFixedInterestRate());
		System.out.println(gb2.getSavingInterestRate());
		System.out.println(gb2.getFixedInterestRate());
	}

}
