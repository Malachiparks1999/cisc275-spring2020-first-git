/*
 *  Edited on: Feb 24th, 2020 (2/24/20)
 *  Author: Malachi Parks
 *  Class Section: 011
 *  Lab Section: 031L
 *  TA: Vineeth Gutta
 *  Due: Mar 1, 2020 (3/1/20)
 *
 *  The dog class has a constructor which takes a name in and number of legs, a toString
 *  getter for legs and equals method for comparing the class
 */

public class Dog extends Animal{
	
	//Constructor
	Dog(String givenName, int legCount){
		super(givenName,legCount);
	}//Dog
	
	
	//toString method
	public String toString() {//prints out the Name of the cat
		return super.toString();
	}//toString
	
}//Dog
