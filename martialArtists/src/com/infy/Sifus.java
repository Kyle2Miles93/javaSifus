package com.infy;

public class Sifus {
	private String sifuName;
	private int age;
	private String city;
	private String martialStyle;
	
	
	// display a given master's biography
	public void displaySifuDetails() {
		System.out.println("Name of Sifu : " + sifuName);
		System.out.println("Martial Style practiced: " + martialStyle);
		System.out.println("City : " + city);
		System.out.println("Age of Master: " + age);
	
	}
	
	// creating a constructor to create different Sifu objects
	public Sifus (String sifuName, int age, String city, String martialStyle) {
		this.sifuName = sifuName;
		this.age = age;
		this.city = city;
		this.martialStyle = martialStyle;
	}
	
	
	
	
	// method for finding future age of sifu in 20 years
	public int findAge(int age) {
		int futureAge = age + 20;
		System.out.println("\nThis Sifu's age in 20 years will be " + futureAge + "\n");
		return futureAge;
	}
	
	
	// auto-generated setters and getters
	public String getSifuName() {
		return sifuName;
	}

	public void setSifuName(String sifuName) {
		this.sifuName = sifuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMartialStyle() {
		return martialStyle;
	}

	public void setMartialStyle(String martialStyle) {
		this.martialStyle = martialStyle;
	}
	
	
	
	
	

}
