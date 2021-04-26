package whoWantsToBeAMillionaire;

public class GameApp
{
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException
	{
		boolean start = true;
		
		while(start == true)
		{
            GamePlay aGamePlay = new GamePlay();
            aGamePlay.questionGenerator();
            start = false;
		}   
	}
}
