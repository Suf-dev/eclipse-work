package com.qa.Maths;

public class Q1 {
	public static void main(String[] args) {
		
		IntInput in = new IntInput();
		
		in.setAddint(1, 1);
		in.setMulti(5, 5);
		in.setSubtract(25, 5);
		in.setDivide(15, 3);
		
		
		int nim1 = in.getAdd();
		int nim2 = in.getMultiply();
		int nim3 = in.getSubtract();
		
		
		System.out.println(nim1);
		System.out.println(nim2);
		System.out.println(nim3);

		
		
		
	}

}


class IntInput {
	
	
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	private int num6;


	public IntInput() {
		
	}
	
	public int getAdd() {
		return num1 + num2;
	}
	public void setAddint(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}
	public int getMultiply() {
		return num3 * num4;
	}
	public void setMulti(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
	}
	public int getSubtract() {
		return num5 - num6;
	}
	public void setSubtract(int num5, int num6) {
		this.num5 = num5;
		this.num6 = num6;
	}

	
		
	public void setDivide(double num7, double num8) {
		if (num7 > num8) {
			System.out.println(num7 / num8);
		}
			else {
				System.out.println("Division cannot be performed");
			}
		}
	}
	
		


