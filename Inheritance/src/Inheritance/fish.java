package Inheritance;

public class fish extends Animal{

	
	private int gills;
	private int eyes;
	private int fins;
	
	
	public fish(String name, int size, int weight ,int gills,int eyes,int fins) {
		super(name, 1, 1, size, weight);
		
		
		this.gills=gills;
		this.eyes=eyes;
		this.fins=fins;
	
	
	  }

	
public void rest(){
	
}


public void movemuscles() {
	
	
}

public void movebacktail() {
	
	
}
public void swim(int speed) {

	movemuscles();
	movebacktail();
	super.move(speed);
	
	
}

	
}
