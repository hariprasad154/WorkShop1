package Com.BridgeLabs;
import java.util.Scanner;
public class PrimeNmber {
	
	static Scanner src =new Scanner(System.in);
	
	

	public static void main(String[] args) {
		int DivCount=0;
		int num=src.nextInt();
		for (int i=2;i<num;i++) {
			if (num %i ==0) {
				DivCount++;
			}else {
				DivCount=DivCount;
			}
		}
		if (num ==2) {
			System.out.println("2 Is a prime Number");
		}else if (DivCount >0) {
			System.out.println(num + " is not a Prime numner");
		}
		else {
			System.out.println(num + "Prime number ");
		}
		}
}
