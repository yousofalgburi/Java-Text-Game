//********************************************************************
//  Deck.java       Author: Yousof Algburi            
//  Date: 5/3/2021
//  Solution to Project 4 - Pig Game
//********************************************************************

public class PigGame 
{
	public static final int GOAL_SCORE = 100;
	private PigPlayer player1, player2;
	
	//-----------------------------------------------------------------
	//	Constructor to initialize PigGame with 2 new UserPigPlayer
	//-----------------------------------------------------------------
	PigGame()
	{
		this.player1 = new UserPigPlayer();
		this.player2 = new UserPigPlayer();
	}
	
	//-----------------------------------------------------------------
	//	Constructor to initialize with 2 PigPlayer
	//-----------------------------------------------------------------
	PigGame(PigPlayer player1, PigPlayer player2)
	{
		this.player1 = player1;
		this.player2 = player2;
	}
	
	//-----------------------------------------------------------------
	//	Function used to handle the main game
	//-----------------------------------------------------------------
	public void play()
	{	
		int player1Score = 0, player2Score = 0, player1TurnScore = 0, player2TurnScore = 0;
		int currentTurn = 1, counter = 0;
		
		Die die = new Die();
		int rollAmount;
		
		while(player1Score < 100 && player2Score < 100)
		{
			if(counter == 0)
			{
				System.out.println("Player 1 score: " + player1Score);
				System.out.println("Player 2 score: " + player2Score);
				System.out.println("It is player " + currentTurn + "'s turn.");
				counter = 1;
			}
			
			if(currentTurn == 1)
			{
				if(player1.isRolling(player1Score, player2Score, player1TurnScore))
				{
					rollAmount = die.nextRoll();
					System.out.println("Roll: " + rollAmount);
					
					if(rollAmount == 1)
					{
						currentTurn = 2;
						counter = 0;
						player1TurnScore = 0;
						
						System.out.println("Turn total: " + player1TurnScore);
						System.out.println("New score: " + player1Score);
					}
					else
					{
						player1TurnScore += rollAmount;
					}
				}
				else
				{
					player1Score += player1TurnScore;
					System.out.println("Turn total: " + player1TurnScore);
					System.out.println("New score: " + player1Score);
					player1TurnScore = 0;
					currentTurn = 2;
					counter = 0;
				}
			}
			else
			{
				if(player2.isRolling(player2Score, player1TurnScore, player2TurnScore))
				{
					rollAmount = die.nextRoll();
					System.out.println("Roll: " + rollAmount);
					
					if(rollAmount == 1)
					{
						currentTurn = 1;
						counter = 0;
						player2TurnScore = 0;
						
						System.out.println("Turn total: " + player2TurnScore);
						System.out.println("New score: " + player2Score);
					}
					else
					{
						player2TurnScore += rollAmount;
					}
				}
				else
				{
					player2Score += player2TurnScore;
					System.out.println("Turn total: " + player2TurnScore);
					System.out.println("New score: " + player2Score);
					player2TurnScore = 0;
					currentTurn = 1;
					counter = 0;
				}
			}
		}
	}
}