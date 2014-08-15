import java.util.Scanner;
public class userGuess {
	private int[] recieveAns;
	private int aCount = 0;//紀錄A的次數
	private int bCount = 0;//紀錄B的次數
	private boolean pass ;
	
	public static void main(String[] args)
	{
		    
		    start theNew = new start();
		    userGuess test = new userGuess();
			theNew.placeNum();
			int[] tt= theNew.getAbb();
			//若為false則重複猜測
			while(test.pass== false)
			{
				test.guess(theNew.getAbb());
				test.passCheck();
				
			}
			System.out.println("恭喜您答對了!!");
			
				
			
		
	}
	
	//執行猜測的動作
	public void guess(int[] theAns)
	{
		aCount = 0;
		bCount = 0;
		int input = 0;
		int[] guess = new int[4];
		
		Scanner scanner = new Scanner(System.in);
		recieveAns = theAns;
		
		System.out.println("請輸入4個數字,一次一個數字");
		
		for(int i = 0; i < 4; i++)
		{
			
			input = scanner.nextInt();
			if(input >9 || input = 0)
			{	//檢查輸入數字是否0~9
				System.out.println("請輸入1~9的數字");
				i--;
				break;
			}
			else
				guess[i] = input;
				for(int j = 0; j < i; j++ )
				{
				
					if(guess[i] == guess[j])
					{	
						i= i -1 ;
						System.out.println("數字不可重複");
						break;
					}
				}
		}
		//檢查A
		for(int aCheck = 0; aCheck < guess.length; aCheck++)
		{
			if(guess[aCheck] == recieveAns[aCheck])
			{	
				guess[aCheck] = 0;
				aCheck--;
				aCount++;
			}						
		}
		//檢查B
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
		
		
		
	 }
	
	//最後檢查是否完成過關條件，是為true，否為false
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
