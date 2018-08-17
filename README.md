Wipro TalentNext PBL

Topics Covered

Hands-on Assignments for Abstract Classes



No. 	Hands-on Assignment 	Topics Covered 	Status

1 	

 1.1. Create a class called GeneralBank which acts as base class for all banks. This class has functionality getSavingInterestRate and getFixedInterestRate methods, which return the saving a/c rate of interest and fixed account rate of interest the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make it abstract.

1.2. Create 2 subclasses of GeneralBank called ICICIBank and KotMBank. Override the methods from base class. ICICI - Savings 4% Fixed 8.5% and KotMBank.  - Savings 6% Fixed 9%

1.3. Create a main method to test the above classes. Try one by one and absorb your finding.
a) ICICIBank object reference instantiated with ICICIBank class.
b) KotMBank object reference instantiated with KotMBank class.
c) GeneralBank object reference instantiated with KotMBank class.
d) GeneralBank object reference instantiated with ICICIBank class.


	Abstract Classes 	

2 	

 Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class. Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice suitable to the type of the compartment.
Create a class TestCompartment . Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.

	Abstract Classes 	

3 	

 Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message 
“Piano is playing  tan tan tan tan  ”  for Piano class
“Flute is playing  toot toot toot toot”  for Flute class
“Guitar is playing  tin  tin  tin ”  for Guitar class 
You must not allow the user to declare an object of Instrument class.
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print that which object stored at which index of instrument array.

	Abstract Classes 	