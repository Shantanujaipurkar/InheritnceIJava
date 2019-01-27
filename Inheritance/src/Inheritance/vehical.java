package Inheritance;

public class vehical {

	private String cartype;
	private int modle;
	private int engine;
	
	
	
	public vehical(String cartype, int modle, int engine) {
		super();
		this.cartype = cartype;
		this.modle = modle;
		this.engine = engine;
	}

public void sterring() {
	
	System.out.println("vehical.sterring() called");
	
}

public void changinggare(int gare) {
	
	
	System.out.println("vehical is at its top gare"+gare);
	
	
}
	
public void moving(int speed) {
	
	System.out.println("the vehical is moving at the speed "+speed);
	
	
}
	
	

	public String getType() {
		return cartype;
	}



	public int getModle() {
		return modle;
	}



	public int getEngine() {
		return engine;
	}



	public void setType(String type) {
		this.cartype = cartype;
	}



	public void setModle(int modle) {
		this.modle = modle;
	}



	public void setEngine(int engine) {
		this.engine = engine;
	}
	
	
	
	
	
	
	
}
