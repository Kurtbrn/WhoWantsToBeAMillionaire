package whoWantsToBeAMillionaire;

import java.util.Random;

public class AskTheAudience
{
	private int A;
	private int B;
	private int C;
	private int D;
	Random rand = new Random();
	char rightAns;

	public AskTheAudience(char rightAns)
	{
		
		this.rightAns = rightAns;
	}

	public void setA(char rightAns)
	{
		A = rand.nextInt(25);
		
		if(rightAns == 'a')
		{
			A = A + 20;
		}
	}

	public void setB(char rightAns)
	{
		B = rand.nextInt(25);
		
		if(rightAns == 'b')
		{
			B = B + 20;
		}
	}

	public void setC(char rightAns)
	{
		C = rand.nextInt(25);

		if(rightAns == 'c')
		{
			C = C + 20;
		}
	}

	public void setD(char rightAns)
	{
		
		D = rand.nextInt(25);
		
		if(rightAns == 'd')
		{
			D = D + 20;
		}
	}

	public int getA()
	{
		return A;
	}

	public int getB()
	{
		return B;
	}

	public int getC()
	{
		return C;
	}

	public int getD()
	{
		return D;
	}
	
	public String toString()
	{
		return "<html>The audience has voted the results are "+"<br>a) "+this.getA()+"<br>b) "+this.getB()+"<br>c) "+this.getC()+"<br>d) "+this.getD();
	}
}
