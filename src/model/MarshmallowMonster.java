package model;

public class MarshmallowMonster
{
	//==============Declaration section=============
	
	
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses; //Vaiable and string don't have to match
	private int armCount;
	
	
	
	public MarshmallowMonster()
	{
		//default constructor
		//boring
	}
	
	public MarshmallowMonster(String name)
	{
		 //assigning name parameter to this
	}
	
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	
	
	public String toString()
	{
		String description = "";
		
		return description;
	}
}
