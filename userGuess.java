import java.util.ArrayList;
import java.util.Scanner;
public class userGuess {
	private int[] recieveAns;
	int aCount = 0;
	int bCount = 0;
	private boolean pass ;
	//private start theNew = new start();
	public static void main(String[] args)
	{
		    
		    start theNew = new start();
		    userGuess test = new userGuess();
			theNew.placeNum();
			int[] tt= theNew.getAbb();
			while(test.pass== false)
			{
				test.guess(theNew.getAbb());
				test.passCheck();
				
			}
			System.out.println("���߱z����F!!");
			
				
			
		
	}
	

	public void guess(int[] theAns)
	{
		aCount = 0;
		bCount = 0;
		int input = 0;
		int arrayListLength = 0;
		int[] guess = new int[4];
		Scanner scanner = new Scanner(System.in);
		recieveAns = theAns;
		System.out.println("�п�J4�ӼƦr,�@���@�ӼƦr");
		
		for(int i = 0; i < 4; i++)
		{
			
			input = scanner.nextInt();
			if(input >9)
			{
				System.out.println("�п�J0~9���Ʀr");
				i--;
				break;
			}
			else
				guess[i] = input;
		}

		for(int aCheck = 0; aCheck < guess.length; aCheck++)
		{
			if(guess[aCheck] == recieveAns[aCheck])
			{	
				guess[aCheck] = 0;
				aCheck--;
				aCount++;
			}						
		}
		
		for(int bCheck1 = 0; bCheck1 < guess.length; bCheck1++ )
		{
			for(int bCheck2 = 0; bCheck2 < guess.length; bCheck2++ )
			{
				if(guess[bCheck1] == recieveAns[bCheck2])
				{
					bCount++;
					
				}
			}
		}		
		System.out.println();
		
		
	 }
	
	public void passCheck()
	{
		if(aCount == 4 && bCount ==0)
		{
			pass = true;
		}
		else
		{
			pass = false ;
		}
		System.out.println(aCount+"A"+bCount+"B");
		
	}
	
}
