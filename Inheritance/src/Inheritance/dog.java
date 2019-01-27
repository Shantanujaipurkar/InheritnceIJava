package Inheritance;

public class dog extends Animal{

	private int eyes;
	private int legs;
	private int tail; //dog class got these additional properties.
	private int teeth;
	private String coat;
	
	
	public dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
		//this is the constructor created in animal class 
		//these aer the basic upto weight properties.
		super(name, 1, 1, size, weight);

	this.eyes=eyes;
	this.legs=legs;				//this keyword is used for calling the current class members ( methods and variables)
	this.tail=tail;				//here we are initalized the additional properties of the dog calss
	this.teeth=teeth;
	this.coat=coat;
	
	
	}
	 void chew() {
		 System.out.println("dog.chew() called");
		 
	 }
	@Override//this override the eat method of the parent calss animal eat method
	
	//now dog class have the it's own and animal class have it's eat() own method.
	public void eat() {
		System.out.println("dog.eat()called");
		chew();
		super.eat();
		//super keyword is used to call the parent calss members(variables and ethod)
		//calling the super equivalent of the class which is animal.
	}
	
	public void walk() {
		System.out.println("dog.walk() called");
		move(5);//calling the move method of the animals class.
		
	}

	public void run() {
		 System.out.println("dog.run() called");
	move(10);//calling the move method of the animals class.
	}
}
