import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1.java,2.oracle,3.python,4.php,5.linux";
	    StringTokenizer st=new StringTokenizer(s,".,12345");
	    while(st.hasMoreTokens())
	    {
	    System.out.println(st.nextToken());
	    }
	}

}
