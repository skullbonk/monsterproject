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
		//This is boring and is also an object that has been made, no data
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNoses, int armCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNoses;
		this.armCount = armCount;
	}
	
	
	
	public String getName()
	{
		return name;
	}   
	
	
	public double getLegCount()
	
	{
		return legCount;
	}
	
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	
	public boolean getHasNoses()
	{
		return hasNoses;
	}
	
	
	public int getArmCount()
	{
		return armCount;
	}
	
	
	

	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setHasNoses(boolean hasNoses)
	{
		this.hasNoses = hasNoses;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	
	
	
	
	
	public String toString()
	{
		String description = "This is " + name + "."
							+ " Legs: " + legCount
							+ " Eyes: " + eyeCount
							+ " Noses: " + hasNoses
							+ " Arms: " + armCount
							+ " He would really appreciate it if someone helped him out.";
		
		return description;
	}
}
