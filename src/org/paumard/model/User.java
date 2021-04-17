package org.paumard.model;

public class User {

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	} 
	
	@Override
	public String toString() 
	{
		//Added comment for to string method
		return "name: " + this.name;
	}
}
