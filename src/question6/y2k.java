package question6;
import java.util.Scanner;
public class y2k {

	public static void main(String[] args) {
		int cur,bir;
		int age=0;
		Scanner sc = new Scanner(System.in);
		bir = sc.nextInt();
		cur = sc.nextInt();
		if(cur>bir) {
			age = cur-bir;
			}
		else if(cur<bir) {
			age = (cur+100)-bir;
		}
		System.out.println(age);
		// TODO Auto-generated method stub

	}

}
