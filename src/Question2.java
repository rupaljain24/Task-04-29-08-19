
public class Question2 {

	public static void main(String[] args) {
		String rnos[] = { "12343434", "3415434", "5633232", "7825145", "3415734" };
		int csCount = 0;
		int itCount = 0;
		int mechCount = 0;
		int civilCount = 0;
		for (String rno : rnos) {
			if (rno.charAt(0) == '1') {
				csCount++;

			} else if (rno.charAt(0) == '3') {
				itCount++;
			} else if (rno.charAt(0) == '5') {
				mechCount++;
			} else if (rno.charAt(0) == '7') {
				civilCount++;
			}

		}
		System.out.println("No of Students in CS=" + csCount);

		System.out.println("No of Students in IT=" + itCount);
		System.out.println("No of Students in MECH=" + mechCount);
		System.out.println("No of Students in CIVIL=" + civilCount);
	}

}
