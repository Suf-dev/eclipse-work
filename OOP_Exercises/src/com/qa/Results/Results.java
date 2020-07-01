package com.qa.Results;

public class Results {
	public static void main(String[] args) {
		
		finals in = new finals();
		
		in.setTotal(40, 30, 20);
		in.setPercentage(40, 30, 30);
	}

}

class finals {
	
	
	public finals() {
	}
	
	public void setTotal(int physics, int chemistry, int biology) {
		System.out.println("physics: " + physics);
		System.out.println("chemistry: " + chemistry);
		System.out.println("biology: " + biology);
		System.out.println("Total: " + (physics + chemistry + biology));

	}
	
	public void setPercentage(int physics, int chemistry, int biology) {
		
		int perc = (physics + chemistry + biology) * (100) / 450;
		System.out.println("your overall percentage is: " + perc);
		
	}
	
}
	
