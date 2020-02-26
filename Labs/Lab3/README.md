# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
	The five objects that were created in main were:
	1. A Dog object named Fido with 4 legs
	2. A Dog object named Fido with 3 legs
	3. A Dog object named Alfie with 4 legs
	4. A ArrayList of type Dog
	5. A Comparator of type Animal which Dog extends

	These items are stored in the Heap since the keyword new was used.
	Also () was used after the keyword new with parameters in them

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
	
	The Comparator constructor is in Collections.sort(dogs, new Comparator<Animal>(). Emphasis on the keyword new with a type
	Animal. THe class definition is within the Collections Framework, however the compare method is defined right after new Comparator.
