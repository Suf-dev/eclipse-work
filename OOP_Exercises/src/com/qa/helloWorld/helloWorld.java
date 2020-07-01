package com.qa.helloWorld;


// question 3, 4


public class helloWorld {
	public static void main(String[] args) {
		
		Output in = new Output();
		
//		in.setMessage("Hey mate");
	
		
		System.out.println(in.getMessage());
		
		
		
		
	}}



class Output {
	
	public String message = "Hiya mate";
	
	public Output() {
		
	}
	
	public Output(String message) {
		this.message = message;
	}
	
	public void setMessage(String message) {
		this.message = message;
		System.out.println(message);
	}
	
	public String getMessage() {
		return message;
	}
	

}
	

		
			
			
		
		
		
		
	
	
	
	
		
		

		
	
		
		
		
		
	
		
		
		
	
		
	


