package example.exercise;

import org.junit.Test;

public class TestSpeller {
	private NumberSpeller spell = new NumberSpeller();
	
	//@Test
	public void test2WordsNumber() {
		spell.spellNumberWords(34);
	}
	
	@Test
	public void test2() {
		spell.spellIt(900000000);
		//spell.spellIt(2121020003);
	}
	
}
