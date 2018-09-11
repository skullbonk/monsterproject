package monster;

import model.MarshmallowMonster;

public class Controller
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members
	public Controller()
	{
		myMonster = new MarshmallowMonster("bIngus", 5.0, 2, true, 3);
	}
	
	public void start()
	{
		System.out.println(myMonster);
	}
}
