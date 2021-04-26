package whoWantsToBeAMillionaire;

import java.util.Random;

public class PhoneAFriend 
{
	private char friend;
	int count;
	char rightAns;

	public PhoneAFriend(int count, char rightAns) 
	{
		this.count = count;
		this.rightAns = rightAns;
	}

	public void setFriend(int count, char rightAns)
	{
		Random rand = new Random();
		int number = rand.nextInt(100)+1;
		
		if(number <= 15) {
			friend = 'a';
		}else if(number > 15 && number <= 30) {
			friend = 'b';
		}else if(number > 30 && number <= 45) {
			friend = 'c';
		}else if(number > 45 && number <= 60) {
			friend = 'd';
		}else{
			friend = rightAns;
		}
	}

	public char getFriend()
	{
		return friend;
	}

	public String toString()
	{
		return "<html>Hi, I think the answer is "+this.getFriend();
	}
}
