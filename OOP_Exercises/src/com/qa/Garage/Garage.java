package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicle {
		
		public List<Vehicle> garage = new ArrayList<Vehicle>();
		
		public Garage() {
			
		}
		
		
		public void addVehicle (Vehicle vh) {
			garage.add(vh); 
		}
		
		public void printVehicles() {
			for(Vehicle vh : garage) {
				System.out.println(vh);
			}
		}
		
	

}
