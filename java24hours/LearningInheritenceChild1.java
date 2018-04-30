package com.java24hours;

public class LearningInheritenceChild1 extends LearningInheritenceParent {
	
	public static void main(String[] args){
		
		LearningInheritenceChild1[] Trip = new LearningInheritenceChild1[2];
		//System.out.println("Count of Objects is: " + Trip[0].getObjectCount());
		int j = 0;
		
		for (int i = 0; i< Trip.length; i++){
			Trip[i] = new LearningInheritenceChild1();
			Trip[i].setBeaches(args[j++]);
			Trip[i].setMountains(args[j++]);
			Trip[i].setParks(args[j++]);
		}
		
		for (int i = 0; i< Trip.length; i++){
			
			System.out.println("Beach " + i + " is " + Trip[i].getBeaches());
			System.out.println("Mountain " + i + " is " + Trip[i].getMountains());
			System.out.println("Park " + i + " is " + Trip[i].getParks());
		}
	
	}

}
