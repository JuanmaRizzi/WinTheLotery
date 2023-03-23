 import java.util.Scanner;
public class LoteryProbability{
	public static void main(String args[]){
		System.out.print("****************************************************************");
		System.out.print("Software to show you your chances to win the lotery");
		System.out.print("****************************************************************");

		Scanner in = new Scanner(System.in);

		System.out.print("How many numbers do you have to choose? ");
		int j= in.nextInt();

		System.out.print("whch is the higesth number you can choose? ");
		int k = in.nextInt();

		long probability = 1L;

		for(int i = 1; i <= j; i++){
		
		 probability = probability * (k - i + 1)/(i);
		 int year = 0;
		}
		
		System.out.print("****************************************************************");
		System.out.print("Your chances to win the lotery  are 1 in  "+ probability );
		System.out.print("****************************************************************");
			

		

		
	}
}