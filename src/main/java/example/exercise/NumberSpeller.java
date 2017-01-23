package example.exercise;

import java.io.PrintStream;
import java.text.DecimalFormat;

public class NumberSpeller {
	private PrintStream out = System.out;
	private DecimalFormat formatter = new DecimalFormat("###,###,###");

	public NumberSpeller() {
	}

	public void spellIt(int num) {
		System.out.printf(formatter.format(num) + ": ");
		if (num == 0) {
			print("zero");
		} else {
			num = spellGroup(num, 1000_000_000, " billion ");
			num = spellGroup(num, 1000_000, " million ");
			num = spellGroup(num, 1000, " thousand ");
			spellHundreds(num);
		}
		print("\n");
	}

	private int spellGroup(int value, int group, String sgroup) {
		int result = value / group;
		if (result != 0) {
			spellHundreds(result);
			print(sgroup);
			value -= result * group;
		}
		return value;
	}

	public void setOutput(PrintStream out) {
		this.out=out;
	}
	
	protected void print(String s) {
		out.print(s);
	}

	void spellHundreds(int num) {
		int result = num / 100;
		if (result != 0) {
			spellUnits(result);
			print(" hundred ");
			num -= result * 100;
		}
		spellNumberWords(num);
		spellUnits(num);
	}

	void spellNumberWords(int num) {
		if (num > 99 || num < 10) {
			return;
		}
		if (num > 9 && num < 20) {
			spellTeens(num);
			return;
		}
		spellTens(num / 10);
		if (num % 10 != 0) {
			print("-");
			spellUnits(num % 10);
		}

	}

	void spellTeens(int num) {
		if (num > 9 && num < 20) {
			switch (num) {
			case 10:
				print("ten");
				break;
			case 11:
				print("eleven");
				break;
			case 12:
				print("twelve");
				break;
			case 13:
				print("thirteen");
				break;
			case 14:
				print("fourteen");
				break;
			case 15:
				print("fifteen");
				break;
			case 16:
				print("sixtenn");
				break;
			case 17:
				print("seventeen");
				break;
			case 18:
				print("eighteen");
				break;
			case 19:
				print("nineteen");
				break;
			}
		}
	}

	void spellUnits(int num) {
		if (num > 9 || num == 0) {
			return;
		}
		switch (num) {
		case 1:
			print("one");
			break;
		case 2:
			print("two");
			break;
		case 3:
			print("three");
			break;
		case 4:
			print("four");
			break;
		case 5:
			print("five");
			break;
		case 6:
			print("six");
			break;
		case 7:
			print("seven");
			break;
		case 8:
			print("eight");
			break;
		case 9:
			print("nine");
			break;
		}

	}

	void spellTens(int num) {
		switch (num) {
		case 0:
			print("zero");
			break;
		case 1:
			print("one");
			break;
		case 2:
			print("twenty");
			break;
		case 3:
			print("thirty");
			break;
		case 4:
			print("fourty");
			break;
		case 5:
			print("fifty");
			break;
		case 6:
			print("sixty");
			break;
		case 7:
			print("seventy");
			break;
		case 8:
			print("eighty");
			break;
		case 9:
			print("ninety");
			break;
		default:
			print("*" + num + "*");
			break;
		}
	}
}
