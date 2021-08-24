package question12;
import java.util.*;

public class seatallocation2 {

	public static void main(String[] args) {
		int r,c,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.of rows:\n");
		r=sc.nextInt();
		System.out.println("enter the no.of columns:\n");
		c=sc.nextInt();
		System.out.println("enter the roll no of the student:\n");
		n=sc.nextInt();
		if((n<=r) || (n%r==1) || (n%r==0))
		{
			System.out.println("Yes");
			
		}
		else {
			System.out.println("no");
		}
		
		// TODO Auto-generated method stub

	}

}
