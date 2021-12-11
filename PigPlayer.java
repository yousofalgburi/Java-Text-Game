//********************************************************************
//  Deck.java       Author: Yousof Algburi            
//  Date: 5/3/2021
//  Solution to Project 4 - Pig Game
//********************************************************************

public interface PigPlayer 
{
	//-----------------------------------------------------------------
	//	Interface used to initialize the isRolling boolean
	//-----------------------------------------------------------------
	boolean isRolling(int myScore, int otherScore, int turnTotal);
}