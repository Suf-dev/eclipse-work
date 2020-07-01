package com.qa.Garage;

import java.util.ArrayList;

public class Vehicle {
	
	private boolean Auto;
	private boolean Petrol;
	private int Topspeed;
	private String make;
	
	public Vehicle(boolean auto, boolean petrol, int topspeed, String make) {
		Auto = auto;
		Petrol = petrol;
		Topspeed = topspeed;
		this.make = make;

	}
	public Vehicle() {
	
	}
	public boolean isAuto() {
		return Auto;
	}
	public void setAuto(boolean auto) {
		Auto = auto;
	}
	public boolean isPetrol() {
		return Petrol;
	}
	public void setPetrol(boolean petrol) {
		Petrol = petrol;
	}
	public int getTopspeed() {
		return Topspeed;
	}
	public void setTopspeed(int topspeed) {
		Topspeed = topspeed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
	

}
