package com.java24hours;

public class LearningInheritenceParent {
	
	static int ObjectCount;
	public String Parks;
	protected String Mountains;
	protected String Beaches;
	
	public String getParks() {
		return Parks;
	}
	public void setParks(String parks) {
		Parks = parks;
	}
	public String getMountains() {
		return Mountains;
	}
	public void setMountains(String mountains) {
		Mountains = mountains;
	}
	public String getBeaches() {
		return Beaches;
	}
	public void setBeaches(String beaches) {
		Beaches = beaches;
	}
	
	LearningInheritenceParent(){
		ObjectCount++;
	}
	public int getObjectCount() {
		return ObjectCount;
	}

}
