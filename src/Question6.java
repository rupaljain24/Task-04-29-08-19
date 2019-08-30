
public class Question6 {

	public static void main(String[] args) {
		String s = "hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		int digits = 0;
		int upperAlphabets = 0;
		int lowerAlphabets = 0;
		int symbol = 0;
		int space = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				digits++;

			} else if (Character.isLetter(ch[i])) {
				if (ch[i] >= 'A' && ch[i] <= 'Z') {
					upperAlphabets++;
				} else {
					lowerAlphabets++;
				}
			} else if (ch[i] == ' ') {
				space++;
			} else {
				symbol++;
			}

		}
		System.out.println("No. of digits=" + digits);
		System.out.println("No. of UpperCase alphabets=" + upperAlphabets);
		System.out.println("No. of LowerCase alphabets=" + lowerAlphabets);
		System.out.println("No. of special Symbols=" + symbol);
		System.out.println("No. of whiteSpace=" + space);

	}

}
