public class start {
	
	private int[] ans = new int[4];
	//產生目標答案
	public void placeNum()
	{
		int[] abb = new int[4];
		for(int i = 0; i < 4; i++)
		{
			abb[i] = (int)(Math.random()*9+1);			
			for(int j = 0; j < i; j++ )
			{
				//檢查是否重複
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
