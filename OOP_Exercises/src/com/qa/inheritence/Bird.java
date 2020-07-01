package com.qa.inheritence;

public class Bird extends Animals {
	
	private boolean wings = true;
	private String featherColour;
	
	public Bird() {
		
	}
	
	public boolean getWings() {
		return wings;
	}
	public void setWings(boolean wings) {
		this.wings = wings;
	}
	public String noise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
	}

}




