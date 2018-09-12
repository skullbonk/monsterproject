package monster;

import model.MarshmallowMonster;
import java.util.Scanner;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	
	//Constructors initialize data members
	public Controller()
	{
		myMonster = new MarshmallowMonster("bIngus", 5.0, 2, true, 3);
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	
	}
	
	public void start()
	{
		
		
		/////////////    User monster here
		
		
		System.out.println("How many arms ya want?");
		int arms = inputScanner.nextInt();
		userMonster.setArmCount(arms);
		System.out.println("Your monster now has like " + userMonster.getArmCount() + " arms! ");
		
		
		System.out.println("Want a nose? Type true or false!");
		boolean nose = inputScanner.nextBoolean();
		userMonster.setHasNoses(nose);
		System.out.println("Congratulations! Nose status has been updated to " + userMonster.getHasNoses());
		
		
		System.out.println("Alright, now how many eyes do you want?");
		int eyes = inputScanner.nextInt();
		userMonster.setEyeCount(eyes);
		System.out.println("Wonderful, you have been granted " + userMonster.getEyeCount() + " eyes!");
		
		
		System.out.println("Heyy uhh if you were to have legs on your monster, how many would there be?");
		double legs = inputScanner.nextDouble();
		userMonster.setLegCount(legs);
		System.out.println("Hey wow good job now you have " + userMonster.getLegCount() + " legs.");
		
		
		System.out.println("What do you want your monster's name to be?");
		String userName = inputScanner.nextLine();
		userMonster.setName(userName);
		System.out.println("Magnificent!" + userMonster.getName() + " Is complete!");
		
		
		
		System.out.println(userMonster);
		System.out.println(myMonster);
	}
}
