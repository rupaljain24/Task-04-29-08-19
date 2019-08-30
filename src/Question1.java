
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emails[] = { "abc@gmail.com", "xyz@yahoo.com", "abc@yahoo.com", "pqr@yahoo.com", "xyz@gmail.com" };
		int gmailCount = 0;
		int yahooCount = 0;

		for (String domain : emails) {
			int n = domain.indexOf("@");
			if (domain.charAt(n + 1) == 'g') {
				gmailCount++;
			}
			if (domain.charAt(n + 1) == 'y') {
				yahooCount++;
			}
		}
		System.out.println("gmail counts :" + gmailCount);
		System.out.println("yahoo counts :" + yahooCount);
	}

}
