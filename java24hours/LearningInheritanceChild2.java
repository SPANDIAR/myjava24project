package com.java24hours;

import java.util.ArrayList;

public class LearningInheritanceChild2 extends LearningInheritenceParent{
	
	private String city;
	private String hotel;

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] locations = {"Santa Cruz",  "Mission Peaks",  "Bayland Parks", "San Jose", "Marriot", "Half Moon Bay", "PG&E Trail", "FairWood Park", "Sunnyvale", "RainTree"};
		ArrayList<LearningInheritanceChild2> Trip = new ArrayList<LearningInheritanceChild2>();
		int j=0;
		
		for(int i=0;i<((locations.length)/5);i++){
			LearningInheritanceChild2 tripObject = new LearningInheritanceChild2();
			tripObject.setBeaches(locations[j++]);
			tripObject.setMountains(locations[j++]);
			tripObject.setParks(locations[j++]);
			tripObject.setCity(locations[j++]);
			tripObject.setHotel(locations[j++]);
			Trip.add(tripObject);
		}
		
		System.out.println("Number of Trip Objects is :" + Trip.size());
		
		for(int k=0;k<Trip.size();k++){
			System.out.println("Beach in Trip " + k + " is: " + Trip.get(k).getBeaches());
			System.out.println("Mountains in Trip " + k + " is: " + Trip.get(k).getMountains());
			System.out.println("Parks in Trip " + k + " is: " + Trip.get(k).getParks());
			System.out.println("City in Trip " + k + " is: " + Trip.get(k).getCity());
			System.out.println("Hotel in Trip " + k + " is: " + Trip.get(k).getHotel());
		}

	}

}
