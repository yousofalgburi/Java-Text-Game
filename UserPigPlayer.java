//********************************************************************
//  Deck.java       Author: Yousof Algburi            
//  Date: 5/3/2021
//  Solution to Project 4 - Pig Game
//********************************************************************
import java.util.Scanner;

public class UserPigPlayer implements PigPlayer
{	
	//-----------------------------------------------------------------
	//	Main constructor with a simple print statement for player instructions
	//-----------------------------------------------------------------
	UserPigPlayer()
	{
		System.out.println("Enter nothing to roll; enter anything to hold.");
	}
	
	//-----------------------------------------------------------------
	//	Function takes care of checking input from the UserPigPlayer to see if they will
	//  Roll or Hold
	//-----------------------------------------------------------------
	@Override
	public boolean isRolling(int myScore, int otherScore, int turnTotal) 
	{
		if(myScore + turnTotal < PigGame.GOAL_SCORE)
		{
			System.out.print("Turn total: " + turnTotal + "	" + "Roll/Hold (Enter)");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			if(input.length() < 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}