package question4;
import java.util.Scanner;

public class fruitseller {

	public static void main(String[] args) {
		System.out.println("Enter the price of dozen Mangoes:");
		System.out.println("Enter the cost price:");
		System.out.println("Enter the selling price:");
		Scanner sc = new Scanner(System.in);
		float a,b,c;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		if(b-c>0)
		{
			System.out.println("loss Rs: "+(b-c));
		}
		else if (b-c<0) {
			System.out.println("profit Rs: "+(c-b));
		}
		else {
			System.out.println("no profit no loss");
		}
		// TODO Auto-generated method stub

	}

}
