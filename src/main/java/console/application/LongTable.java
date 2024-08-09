package console.application;

public class LongTable implements Table {
	
	double length;
	double breadth;
	
	public LongTable() {
		this.length = 20.5;
		this.breadth = 10.5;
	}

	@Override
	public String showDetails() {
		// TODO Auto-generated method stub
		return "The length is "+this.length +" and the breadth is "+this.breadth;
	
	}

}
