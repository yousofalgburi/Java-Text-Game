//********************************************************************
//  Deck.java       Author: Yousof Algburi            
//  Date: 5/3/2021
//  Solution to Project 4 - Pig Game
//********************************************************************

public class HoldAt20PigPlayer implements PigPlayer
{	
	//-----------------------------------------------------------------
	//	Function detects if the HoldAt20Player can roll or not
	//-----------------------------------------------------------------
	@Override
	public boolean isRolling(int myScore, int otherScore, int turnTotal)
	{	
		if(turnTotal < 20 && myScore + turnTotal < PigGame.GOAL_SCORE)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}