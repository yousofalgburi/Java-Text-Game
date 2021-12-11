//********************************************************************
//  Deck.java       Author: Yousof Algburi            
//  Date: 5/3/2021
//  Solution to Project 4 - Pig Game
//********************************************************************

public class OOPig 
{
	//-----------------------------------------------------------------
	//	Main function used to initialize the PigGame
	//-----------------------------------------------------------------
	public static void main(String[] args)
	{	
		int temp = (int)(Math.random() * 2 + 1);
		System.out.println("You will be player " + temp + ".");
		
		HoldAt20PigPlayer pigRobot = new HoldAt20PigPlayer();
		UserPigPlayer pigPlayer = new UserPigPlayer();
		PigGame pigGame;
				
		if(temp == 1)
		{
			pigGame = new PigGame(pigPlayer, pigRobot);
		}
		else
		{
			pigGame = new PigGame(pigRobot, pigPlayer);
		}
		
		pigGame.play();
	}
}