package Inheritance;

public class Main {

	public static void main(String[] args) {

		Animal animal=new Animal("animal", 1, 1, 5, 5); //the objects are created.
		
		dog dog=new dog("sheru", 2, 4, 1, 30, 01, 1, "lovely");
		
		fish nemo=new fish("nemo", 2, 2, 1, 3, 1);
		
		
		dog.eat();//here we are calling the public method created in Animals.
		System.out.println("**************************************************");

		dog.chew();
		
		System.out.println("**************************************************");

		dog.walk();
		
		System.out.println("**************************************************");
		
		dog.run();
		
		System.out.println("**************************************************");

	nemo.rest();
	
	nemo.swim(8);
		
	}

}
