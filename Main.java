package main;
public class Main {
	public static void main(String[] args) {
	    Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
	    Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
	    
	    // %50 olasılık ile ilk oyuncuyu belirle
	    Fighter firstFighter = Math.random() < 0.5 ? marc : alex;
	    Fighter secondFighter = firstFighter == marc ? alex : marc;
	    
	    Ring r = new Ring(firstFighter, secondFighter, 90, 100);
	    r.run();
	}

}