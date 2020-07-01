package com.qa.inheritence;

public class Runner {
	public static void main(String[] args) {
		Lion in = new Lion();
		Bird en = new Bird();
		
		// Lion
		in.setFurColour("Orange");
		in.setNOofPaws(4);
		in.setNoise("RRRRRRRRRRR");
		
		
		// Bird
		en.setWings(true);
		en.setNoise("TWEETTWEET");
		
		
		// Lion
		System.out.println(in.getFurColour());
		System.out.println(in.getNOofPaws());
		System.out.println(in.getNoise());
		System.out.println(en.getWings());
		System.out.println(en.getNoise());
	
		
		
		
	}

}
