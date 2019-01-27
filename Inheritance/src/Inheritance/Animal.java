package Inheritance;

public class Animal {
	
	
	private String name;
	private int brain ;
	private int body;
	private int size;
	private int weight;
	
	
	public Animal(String name, int brain, int body, int size, int weight) {
		super();
		this.name = name;
		this.brain = brain;
		this.body = body;   //here we are  calling the variables of the animals class.
		this.size = size;
		this.weight = weight;
	}

	
	public void eat() {
		
		System.out.println("animal.eat() called");
		
	}
	 public void move(int speed) {
		 System.out.println("Animal is moving at "+speed);
		 
	 }
	
	//these are the tow methods thet are unique to all the animals.

	public String getName() {
		return name;
	}


	public int getBrain() {
		return brain;
	}


	public int getBody() {
		return body;
	}


	public int getSize() {
		return size;
	}


	public int getWeight() {
		return weight;
	}

}
