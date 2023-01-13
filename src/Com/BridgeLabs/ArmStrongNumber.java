package Com.BridgeLabs;
import java.util.Scanner;
import java.math.*;
public class ArmStrongNumber {
	public static void main(String[] args) {
		int Num1 =371;
		int Num2=Num1;
		int Output =0;
		int flag =0;
		while(Num2 !=0) {
			flag=Num2 % 10 ;
			Output += (flag)*(flag)*(flag);
			Num2=Num2/10;

		}
		if (Output==Num1) {
			System.out.println(Num1 +" the given Number is arm Strong");
		}else {
			System.out.println(Num1 +" the given Number is not arm Strong");
		}
	}

}
