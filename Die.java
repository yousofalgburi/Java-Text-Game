//********************************************************************
//  Deck.java       Author: Yousof Algburi            
//  Date: 5/3/2021
//  Solution to Project 4 - Pig Game
//********************************************************************
import java.util.Random;

public class Die 
{	
	private int[] values;
	private Random random = new Random();
	private int randomNumber;
	
	//-----------------------------------------------------------------
	//	First constructor that takes 0 parameters
	//-----------------------------------------------------------------
	Die()	
	{
		values = new int[]{1,2,3,4,5,6};
	}
	
	//-----------------------------------------------------------------
	//	Second constructor that takes 1 parameters
	//-----------------------------------------------------------------
	Die(int[] outcomes)
	{
		values = new int[outcomes.length];
		
		for(int i = 0; i < outcomes.length; i++)
		{
			values[i] = outcomes[i];
		}
	}
	
	//-----------------------------------------------------------------
	//	Third constructor that takes 2 parameters
	//-----------------------------------------------------------------
	Die(int sides, int min)
	{
		int[] temp = new int[sides];		
		
		for(int i = 0; i < sides; i++)
		{
			temp[i] = min++;
		}
		
		values = temp;
	}
	
	//-----------------------------------------------------------------
	//	Variable function used to roll the die
	//-----------------------------------------------------------------
	int nextRoll()
	{
		randomNumber = random.nextInt(values.length);	
		return values[randomNumber];
	}
	
}