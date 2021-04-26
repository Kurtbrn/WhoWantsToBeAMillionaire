package whoWantsToBeAMillionaire;

public class FiftyFifty
{
	private String question;
	int count;
	
	public void setQuestion(int count)
	{
		switch(count)
		{
			case 1:
				question = "<html>Whos the lead singer of the band U2?<br> a) <br> b) Sono<br> c) Bono<br> d)";
				break;
				
			case 2:
				question ="<html>A childrens game where you sit in a circle is called duck duck what?<br> a)Pigeon<br> b)Goose<br> c)<br> d)";
				break;
				
			case 3:
				question ="<html>A worker called a grease monkey is often called what?<br> a)<br> b)<br> c)Mechanic<br> d)Nurse";
				break;
				
			case 4:
				question ="<html>The main actor of the movie Four Weddings and a Funeral was who?<br> a)Hugh Grant<br> b)<br> c)Patrick Stewart<br> d)";
				break;
				
			case 5:
				question ="<html>What is the main vitamin in an apple?<br> a)<br> b)b<br> c)c<br> d)";
				break;
				
			case 6:
				question ="<html>A native New Zealand bird that is known for pulling rubber parts off of cars is called what?<br>a)<br>b)Rooster<br>c)<br>d)Kea";
				break;
				
			case 7:
				question ="<html>What is the disease lockjaw also known as?<br>a)Tetnus<br>b)Lukemia<br>c)<br>d)";
				break;
				
			case 8:
				question ="<html>The song 'The real thing' was written by which artist?<br>a)<br>b)Bess Wilson<br>c)Jonny Young<br>d)";
				break;
				
			case 9:
				question ="<html>What used to be the Australian city of Darwins name?<br>a)<br>b)<br>c)Palmerston<br>d)Arafura";
				break;
				
			case 10:
				question ="<html>Who wrote the Pipi Longstockings book series?<br>a)<br>b)Astrid Lindgren<br>c)<br>d)Anna Sewell";
				break;
				
			case 11:
				question ="<html>Which of these formor NZ prime ministers served longest?<br>a)Richard Seddon<br>b)Sidney Holland<br>c)<br>d)";
				break;
				
			case 12:
				question ="<html>Thomas Mapother was the former name of which celebrity?<br>a)Tom Cruise<br>b)<br>c)<br>d)Tom Petty";
				break;
				
			case 13:
				question ="<html>Korfball is an old game similar to what modern game?.<br>a)<br>b)Basketball<br>c)<br>d)Cricket";
				break;
				
			case 14:
				question ="<html>Who starred in the movie Spider-man in 2005<br>a)Tobey Maguire<br>b)<br>c)Jonny Depp<br>d)";
				break;
				
			case 15:
				 question ="<html>Okay, time for the million dollar question.<br><br>Who invented the piano<br>a)<br>b)<br>c)Antonio Meucci<br>d)Bartolomeo Cristofori";
				break;
		}

	}
	public String getQuestion()
	{
		return question;
	}

	public String toString()
	{
		return " "+this.getQuestion();
	}
}
