package com.infy;

public class Tester {

	public static void main(String[] args) {
		// sifu general info 
		Sifus ycWong = new Sifus(null, 0, null, null);
		
		
		//use setters to change default variables to actual values
		ycWong.setMartialStyle("Hung Gar");
		ycWong.setSifuName("Yew Ching Wong");
		ycWong.setAge(87);
		ycWong.setCity("San Francisco");
		
		ycWong.displaySifuDetails();
		
		// invoke findAge method
		ycWong.findAge(87);
		
		// new object using sifu constructor
		Sifus docFaiWong = new Sifus("Doc Fai Wong", 73, "San Francisco", "Choy Lay Fut");
		docFaiWong.displaySifuDetails();
		docFaiWong.findAge(73);
		
	}
	

}
