package com.qa.Garage;

public class Truck extends Vehicle {
	
	private Double LorryCapacity;
	private boolean withTrailer;
	
	public Truck() {
		
	}

	public Double getLorryCapacity() {
		return LorryCapacity;
	}

	public void setLorryCapacity(Double lorryCapacity) {
		LorryCapacity = lorryCapacity;
	}

	public boolean isWithTrailer() {
		return withTrailer;
	}

	public void setWithTrailer(boolean withTrailer) {
		this.withTrailer = withTrailer;
	}
	

}
