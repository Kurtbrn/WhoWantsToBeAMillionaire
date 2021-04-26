package whoWantsToBeAMillionaire;

import static org.junit.Assert.*;
import org.junit.Test;

public class FiftyFiftyTest {

	@Test
	public void test() {
		FiftyFifty aFiftyFifty = new FiftyFifty();
		aFiftyFifty.setQuestion(3);
		
		String question = aFiftyFifty.getQuestion();
		assertEquals("<html>A worker called a grease monkey is often"
				+ " called what?<br> a)<br> b)<br> c)Mechanic<br> d)Nurse", question);
	}
}
