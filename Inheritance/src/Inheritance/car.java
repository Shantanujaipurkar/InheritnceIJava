package Inheritance;

public class car extends vehical{
	
	private String colour;
	private int numberofgares;
	private String company;
	
	
	
	public car(String cartype ,String colour, int numberofgares,String company) {
		super(cartype, 1, 4);

	this.colour=colour;
	this.numberofgares=numberofgares;
	this.colour=company;
	
	
	}
	
	public void topspeed() {
		
		System.out.println("car is moving");
moving(10);

	}
	public void topgare() {
		
		System.out.println("car is in it's topgare");
		super.changinggare(8);
		}

	@Override
	public void sterring() {
System.out.println("the overriding mthod is called");
		
		super.sterring();
	}
	
	
	
}
