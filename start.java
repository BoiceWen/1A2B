public class start {
	
	private int[] ans = new int[4];
	public void placeNum()
	{
		int[] abb = new int[4];
		//ArrayList<Integer> abb1 = new ArrayList<Integer>();
		
		//userGuess guess2 = new userGuess();
		
		for(int i = 0; i < 4; i++)
		{
			abb[i] = (int)(Math.random()*9+1);			
			for(int j = 0; j < i; j++ )
			{
				if(abb[i] == abb[j])
				{	
					i= i -1 ;
					break;
				}
			}
		}

		setAbb(abb);
	
	}
	public  void setAbb(int[] gue)
	{
		ans = gue;
	}
	
	public int[] getAbb()
	{
		return ans;
		
	}
}
