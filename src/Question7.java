
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India,Australia,England,Canada";
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ',') {
				ch[i] = '\n';
			}
			System.out.print(ch[i]);
		}

	}

}
