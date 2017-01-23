package example.exercise;

import org.junit.Test;

public class TestSpeller {
	private NumberSpeller spell = new NumberSpeller();
	
	@Test
	public void test2() {
		spell.spellIt(900000000);
		spell.spellIt(321020003);
		spell.spellIt(1234567892);
		spell.spellIt(0);
		spell.spellIt(10);
		spell.spellIt(100);
		spell.spellIt(110);
		spell.spellIt(103);
		spell.spellIt(2400);
	}
	
}
