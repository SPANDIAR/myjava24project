package com.java24hours;

import java.util.ArrayList;

public class LearningInheritanceChild2 extends LearningInheritenceParent{
	
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] locations = {"Santa Cruz",  "Mission Peaks",  "Bayland Parks", "San Jose", "Half Moon Bay", "PG&E Trail", "FairWood Park", "Sunnyvale"};
		ArrayList<LearningInheritanceChild2> Trip = new ArrayList<LearningInheritanceChild2>();
		int j=0;
		
		for(int i=0;i<((locations.length)/4);i++){
			LearningInheritanceChild2 tripObject = new LearningInheritanceChild2();
			tripObject.setBeaches(locations[j++]);
			tripObject.setMountains(locations[j++]);
			tripObject.setParks(locations[j++]);
			tripObject.setCity(locations[j++]);
			Trip.add(tripObject);
		}
		
		System.out.println("Number of Trip Objects is :" + Trip.size());

	}

}
