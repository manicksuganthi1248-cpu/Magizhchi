import java.util.Scanner;

class PosNeg{
	public static void main(String [] args){
		Scanner pn = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int num = pn.nextInt();

		if(num >0){
			System.out.println("The given number is positive");
		}
		else{
			System.out.println("The given number is negative");
		}
	}
}
