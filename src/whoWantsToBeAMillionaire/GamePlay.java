package whoWantsToBeAMillionaire;

import static java.lang.Thread.sleep;
import java.util.InputMismatchException;

public class GamePlay 
{
    private static String question = "";

    public static void questionGenerator() throws InterruptedException
	{
		int count = 1;
		char rightAns = 0;

		int fiftyFifty = 1;
		int phoneFriend = 1;
		int askAudience = 1;
		
		question ="<html>Welcome to Who wants to be a millionaire!<br>"
				+ "In this game you will answer 15 questions to get to one million dollars.<br>"
				+ "To answer the question click a, b, c, or d<br>"
				+ "You have three life lines to help you out";

		FirstWindow aWindow = new FirstWindow();
        aWindow.firstWindow(question);
        aWindow.setVisible(true);
        sleep(5000);
        
		do{
			char ans = 0;

			switch(count)
			{
			
				case 1:
					question ="<html>Who's the lead singer of the band U2?<br> a) Gono<br> b) Sono<br> c) Bono<br> d) Rono";
					rightAns = 'c';
					break;
					
				case 2:
					question = "<html>You currently have $100<br>A childrens game where you sit in a circle is called duck duck what?<br> a)Pigeon<br> b)Goose<br> c)Moa<br> d)Fantail";
					rightAns = 'b';
					break;
					
				case 3:
					question="<html>You currently have $200<br>A worker called a grease monkey works in which job?<br> a)Cleaner<br> b)Teacher<br> c)Mechanic<br> d)Nurse";
					rightAns = 'c';
					break;
					
				case 4:
					question="<html>You currently have $300<br>The main actor of the movie Four Weddings and a Funeral was who?<br> a)Hugh Grant<br> b)Paul Rand<br> c)Patrick Stewart<br> d)James Behrer";
					rightAns = 'a';
					break;
					
				case 5:
					question="<html>You currently have $500<br>what is the main vitamin in an apple?<br> a)a<br> b)b<br> c)c<br> d)v";
					rightAns = 'c';
					break;
					
				case 6:
					question="<html>You currently have $1000<br>A native New Zealand bird that is known for pulling rubber parts off of cars is called what?<br>a)Kiwi<br>b)Rooster<br>c)Duck<br>d)Kea";
					rightAns = 'd';
					break;
					
				case 7:
					question="<html>You currently have $2000<br>what is the disease lockjaw also known as?<br>a)Tetnus<br>b)Lukemia<br>c)Leprosy<br>d)Chicken Poxs";
					rightAns = 'a';
					break;
					
				case 8:
					question="<html>You currently have $4000<br>The song 'The real thing' was written by which artist?<br>a)Molly Kain<br>b)Bess Wilson<br>c)Jonny Young<br>d)James Young";
					rightAns = 'c';
					break;
					
				case 9:
					question="<html>You currently have $8000<br>What used to be the Australian city of Darwins name?<br>a)Kakadu<br>b)Katharine<br>c)Palmerston<br>d)Arafura";
					rightAns = 'c';
					break;
					
				case 10:
					question="<html>You currently have $16000<br>Who wrote the Pipi Longstockings book series?<br>a)C.S. Lewis<br>b)Astrid Lindgren<br>c)A.A. Milne<br>d)Anna Sewell";
					rightAns = 'b';
					break;
					
				case 11:
					question="<html>You currently have $32000<br>which of these formor NZ prime ministers served longest?<br>a)Richard Seddon<br>b)Sidney Holland<br>c)Jenny Shipley<br>d)Mike Moore";
					rightAns = 'a';
					break;
					
				case 12:
					question="<html>You currently have $64000<br>Thomas Mapother was the former name of which celebrity?<br>a)Tom Cruise<br>b)Tom Jones<br>c)Tom Hanks<br>d)Tom Petty";
					rightAns = 'a';
					break;
					
				case 13:
					question="<html>You currently have $125000<br>Korfball is an old game similar to what modern game?.<br>a)Hockey<br>b)Basketball<br>c)Baseball<br>d)Cricket";
					rightAns = 'b';
					break;
					
				case 14:
					question="<html>You currently have $250000<br>who starred in the movie Spider-man in 2005<br>a)Tobey Maguire<br>b)Hugh Jackman<br>c)Jonny Depp<br>d)Tom Hanks";
					rightAns = 'a';
					break;
					
				case 15:
					 question="<html>You currently have $500000<br>Okay, time for the million dollar question.<br><br>Who invented the piano<br>a)Adolph Rickenbacker<br>b)Alexander Bell<br>c)Antonio Meucci<br>d)Bartolomeo Cristofori";
					rightAns = 'd'; 
			}
            String buttonAns = null;
            aWindow.setButtonNull();

            while(buttonAns == null) 
            {
            	buttonAns = aWindow.firstWindow(question);
            	aWindow.setVisible(true);
            }
                        
			try{
                ans = buttonAns.charAt(0);

				if(ans == 'e' && fiftyFifty == 1)
				{
					FiftyFifty aFiftyFifty = new FiftyFifty();//return count
					aFiftyFifty.setQuestion(count);
                    String fifty = aFiftyFifty.getQuestion();
                    aWindow.setButtonNull();
                    buttonAns = null;
                    
                    while(buttonAns == null) 
                    {
                    	buttonAns = aWindow.firstWindow(fifty);
                        aWindow.setVisible(true); 
                    }
                    fiftyFifty--;
					ans = buttonAns.charAt(0);
					
				}
				if(ans == 'f' && phoneFriend == 1)
				{
					PhoneAFriend aFriend = new PhoneAFriend(count, rightAns);
					aFriend.setFriend(count, rightAns);
					String friend = aFriend.toString();
                    aWindow.setButtonNull();
                    buttonAns = null;
                    while(buttonAns == null)
                    {
                    	buttonAns = aWindow.firstWindow(friend);
                        aWindow.setVisible(true);   
                    }
                    phoneFriend--;
					ans = buttonAns.charAt(0);
				}
				if(ans == 'g' && askAudience == 1)
				{
					AskTheAudience aAudience = new AskTheAudience(rightAns);
					aAudience.setA(rightAns);
					aAudience.setB(rightAns);
					aAudience.setC(rightAns);
					aAudience.setD(rightAns);
					String audience = aAudience.toString();
                    aWindow.setButtonNull();
                    buttonAns = null;
                    while(buttonAns == null)
                    {
                    	buttonAns = aWindow.firstWindow(audience);
                        aWindow.setVisible(true);   
                    }
                    askAudience--;
					ans = buttonAns.charAt(0);
				}
			
			}
			catch(InputMismatchException inputMismatchException)
			{
				System.err.println("Exceptional event: "+inputMismatchException);
			}
			if(ans == rightAns)
			{
				question="<html>Thats the right answer.";
                aWindow.firstWindow(question);
                aWindow.setVisible(true);
                sleep(600);          
                count ++;
                                
			}
			else if(ans != rightAns && ans == 'a' || ans == 'b' || ans == 'c' || ans == 'd')
			{
                question="<html>Oh! i'm sorry thats the wrong answer.<br>END OF GAME";
                aWindow.firstWindow(question);
                aWindow.setVisible(true);
				break;
			}
			if(count == 16 && ans == rightAns)
			{
				question="<html>Congratulations you have just won 1 Million dollars<br>END OF GAME";
                aWindow.firstWindow(question);
                aWindow.setVisible(true);
				break;
			}
			
		}while(count < 16);
		
	}
}
