package console.application;

public class ShortTable implements Table {
	
	double length;
	double breadth;
	
	public ShortTable() {
		this.length = 10.5;
		this.breadth = 5.5;
	}

	@Override
	public String showDetails() {
		// TODO Auto-generated method stub
		return "The length is "+this.length +" and the breadth is "+this.breadth;
	}

}
