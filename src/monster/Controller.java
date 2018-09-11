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
		myMonster = new MarshmallowMonster();
	}
	
	public void start()
	{
		System.out.println(myMonster);
	
	}
}
