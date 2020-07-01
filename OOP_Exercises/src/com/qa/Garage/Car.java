package com.qa.Garage;

public class Car extends Vehicle {

	public Car(boolean auto, boolean petrol, int topspeed, String make) {
		super(auto, petrol, topspeed, make);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [isAuto()=" + isAuto() + ", isPetrol()=" + isPetrol() + ", getTopspeed()=" + getTopspeed()
				+ ", getMake()=" + getMake() ;
	}
	
	


	
	

	
	
	
	
	
}

