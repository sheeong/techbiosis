package example.exercise;

public class Speller {
	public Speller() {}
	
	public void spellIt(int num) {
		System.out.println(num);
		int result = num / 1000000000;
		if (result != 0) {
			spellNumber(result);
			print(" billion ");
			num -= result * 1000000000;
		}
		result = num / 1000000;
		if (result != 0) {
			//System.out.println(result);
			spellHundreds(result);
			print(" million ");
			num -= result * 1000000;
		}
		result = num / 1000;
		if (result != 0) {
			//System.out.println("\n"+result);
			spellHundreds(result);
			print(" thousand ");
			num -= result * 1000;
			//System.out.println("\n" + num);
		}
		spellHundreds(num);
		
	}
	
	protected void print(String s) {
		System.out.print(s);
	}
	
	void spellHundreds(int num) {
		int result = num / 100;
		if (result != 0) {
			spellNumber(result);
			print(" hundred ");
			num -= result * 100;
		}
		spellNumberWords(num);
		spellNumber(num);
	}
	
	void spellNumberWords(int num) {
		if (num > 99 || num < 10) {
			return;
		}
		if (num >9 && num < 20) {
			spellTeens(num);
			return;
		}
		spellTens(num / 10);
		if (num % 10 != 0) { 
			print("-"); 
			spellNumber(num % 10);
		}
		
	}
	
	void spellTeens(int num) {
		if (num > 9 && num < 20) { 
		switch (num) {
		//case 0: print("zero"); break;
		case 10: print("ten"); break;
		case 11: print("eleven"); break;
		case 12: print("twelve"); break;
		case 13: print("thirteen"); break;
		case 14: print("fourteen"); break;
		case 15: print("fifteen"); break;
		case 16: print("sixtenn"); break;
		case 17: print("seventeen"); break;
		case 18: print("eighteen"); break;
		case 19: print("nineteen"); break;
		default: print("*"+num+"*"); break;
		}
		}
	}

	void spellNumber(int num) {
		if (num > 9 || num == 0) { return; }
		switch (num) {
		//case 0: print("zero"); break;
		case 1: print("one"); break;
		case 2: print("two"); break;
		case 3: print("three"); break;
		case 4: print("four"); break;
		case 5: print("five"); break;
		case 6: print("six"); break;
		case 7: print("seven"); break;
		case 8: print("eight"); break;
		case 9: print("nine"); break;
		default: print("*"+num+"*"); break;
		}
		
	}

	void spellTens(int num) {
		switch (num) {
		//case 0: print("zero"); break;
		case 1: print("one"); break;
		case 2: print("twenty"); break;
		case 3: print("thirty"); break;
		case 4: print("fourty"); break;
		case 5: print("fifty"); break;
		case 6: print("sixty"); break;
		case 7: print("seventy"); break;
		case 8: print("eighty"); break;
		case 9: print("ninety"); break;
		default: print("*"+num+"*"); break;
		}
	}
}
