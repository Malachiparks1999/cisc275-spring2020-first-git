/*
 *  Edited on: Feb 24th, 2020 (2/24/20)
 *  Author: T Harvey
 *  Editor: Malachi Parks
 *  Class Section: 011
 *  Lab Section: 031L
 *  TA: Vineeth Gutta
 *  Due: Mar 1, 2020 (3/1/20)
 *
 *  This file contains the contents for lab 3. Lab 3 is an introduction to git and github.
 *  We must create a dog class with a constructor, getter for legs, to string and equals methods
 *  
 *  Additionally an Animal class must be made which has the same constructor as the Dog Class.
 *  Then the Dog class extends the animal class
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3 {
	
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>() {
			@Override
			public int compare(Animal a, Animal b){
				System.out.println("Running Compare");
			    return a.getLegs() - b.getLegs();
			}// compare
		});
		System.out.println(dogs);
	}
}
