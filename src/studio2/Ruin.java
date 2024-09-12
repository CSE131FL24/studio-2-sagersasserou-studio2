package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Starting Amount: ");
		int startAmount = in.nextInt();
		int startAmount2 = startAmount;
		
		System.out.println("Win Chance: ");
		double winChance = in.nextDouble();
		
		System.out.println("Win Limit: ");
		int winLimit = in.nextInt(); 
		
		System.out.println("Total Simulations: ");
		int totalSimulations = in.nextInt();
	
		int numberOfPlays =0;
		String sucess;
		
		for (int simulations = 1; simulations <= totalSimulations; simulations ++) {
	while ((startAmount<winLimit) && (startAmount!=0)) {
		double randNumber = Math.random();
		if (randNumber < winChance) {
		startAmount ++;
	
		}
		else {
		 startAmount --;
		
		}
		numberOfPlays ++;
		}	
	
	
	if ( startAmount ==0 ) {
		sucess = "LOSE";
	}
	else {
		sucess = "WIN";
	}
	
	System.out.println("Simulation " + simulations + ": " + numberOfPlays + " " + sucess);
	startAmount = startAmount2;
	numberOfPlays = 0;
		
		}
}
}


