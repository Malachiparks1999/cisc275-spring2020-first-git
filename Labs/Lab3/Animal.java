/*
 *  Edited on: Feb 24th, 2020 (2/24/20)
 *  Author: Malachi Parks
 *  Class Section: 011
 *  Lab Section: 031L
 *  TA: Vineeth Gutta
 *  Due: Mar 1, 2020 (3/1/20)
 *
 *  The dog Animal has a constructor which takes a name in and number of legs, a toString
 *  getter for legs and equals method for comparing the class
 */
public class Animal {
	private String name; // name of the Dog
	private int legs;// number of legs the dog has
	
	//Constructor
	Animal(String givenName, int legCount){
		System.out.println("Creating " + givenName);// prints out when item is being constructed
		name = givenName;//name of the Animal
		legs = legCount;// amount of legs the animal has
	}//Dog
	
	//Getter for Legs
	public int getLegs() {
		return legs; // returns leg count
	}//getLegs
	
	//toString method
	public String toString() {//prints out the Name of the cat
		return name;
	}//toString
	

}//Animal
