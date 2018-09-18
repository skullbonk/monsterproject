package monster;

import model.MarshmallowMonster;
import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	//private Scanner inputScanner;
	
	//Constructors initialize data members
	public Controller()
	{
		myMonster = new MarshmallowMonster("bIngus", 5.0, 2, true, 3);
		userMonster = new MarshmallowMonster();
	//	inputScanner = new Scanner(System.in);
	
	}
	
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, myMonster);
		
		/////////////    User monster here
		
		
		//System.out.println("How many arms ya want?");
		//int arms = inputScanner.nextInt();
		String userInput = JOptionPane.showInputDialog(null, "How many arms ya want?");
		int arms = 0; 
		if(validInt(userInput))
		{
			arms = Integer.parseInt(userInput);
		}
		else
		{
			userInput = JOptionPane.showInputDialog(null, "Type an integer, Dingus. No letters. No decimals.");
			arms = Integer.parseInt(userInput);
		}
		userMonster.setArmCount(arms);
		//System.out.println("Your monster now has like " + userMonster.getArmCount() + " arms! ");
		JOptionPane.showMessageDialog(null, "Your monster now has like " + userMonster.getArmCount() + " arms!");
		
		
		//System.out.println("Want a nose? Type true or false!");
		userInput = JOptionPane.showInputDialog(null, "Want a nose? Type true or false!");
		boolean nose = Boolean.parseBoolean(userInput);		
		//boolean nose = inputScanner.nextBoolean();
		userMonster.setHasNoses(nose);
		//System.out.println("Congratulations! Nose status has been updated to " + userMonster.getHasNoses());
		JOptionPane.showMessageDialog(null, "Congratulations! Nose status has been updated to " + userMonster.getHasNoses());
		
		//System.out.println("Alright, now how many eyes do you want?");
		//int eyes = inputScanner.nextInt();
		int eyes = 0;
		userInput = JOptionPane.showInputDialog(null, "Alright, now how many eyes do you want?");
		if(validInt(userInput))
		{
			eyes = Integer.parseInt(userInput);
		}
		else 
		{
			userInput = JOptionPane.showInputDialog(null, "Listen, kid. You gotta type an integer in here");
			if(validInt(userInput))
			{
				eyes = Integer.parseInt(userInput);
			}
		}
		
		userMonster.setEyeCount(eyes);
		//System.out.println("Wonderful, you have been granted " + userMonster.getEyeCount() + " eyes!");
		JOptionPane.showMessageDialog(null, "Wonderful, you have been granted " + userMonster.getEyeCount() + "eyes.");
		
		//System.out.println("Heyy uhh if you were to have legs on your monster, how many would there be?");
		userInput = JOptionPane.showInputDialog(null, "Heyy uhh, if you were to have legs on your monster, how many would there be?");
		double legs = 0.0;
		if(validDouble(userInput))
		{
			legs = Double.parseDouble(userInput);
		}
		
		//double legs = inputScanner.nextDouble();
		userMonster.setLegCount(legs);
		//System.out.println("Hey wow good job now you have " + userMonster.getLegCount() + " legs.");
		JOptionPane.showMessageDialog(null, "Hey wow good job now you have " + userMonster.getLegCount() + " legs.");
		
		//System.out.println("What do you want your monster's name to be?");
		String userName = JOptionPane.showInputDialog(null, "What do you want your monster's name to be?");
		//String userName = inputScanner.nextLine();
		userMonster.setName(userName);
		//System.out.println("Magnificent!" + userMonster.getName() + " Is complete!");
		JOptionPane.showMessageDialog(null, "Magnificent! " + userMonster.getName() + " Is complete!");
		
		
		//System.out.println(userMonster);
		JOptionPane.showMessageDialog(null, userMonster);
		//System.out.println(myMonster);
		JOptionPane.showMessageDialog(null, myMonster);
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You fricked it up dingus. Try typing in a number. A whole number. And don't type it out, smart boy.");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
			catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a dang decimal you dorito");
		}
	
		return isValid;
	}
}