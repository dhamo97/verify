import java.util.Scanner;

public class MyCalculator implements AdvancedArithmetic {
public static void main(String[] args) {
	


		Scanner s = new Scanner(System.in);
		 int n =s.nextInt();
		 
		 for (int i = 1; i <= s.nextInt(); i++) {
			 if(i%2==0) {
				 System.out.println(i);
			 }
			 
			
		}
		
	
	
	
}

@Override
public int divisor_sum(int n) {
	// TODO Auto-generated method stub
	return 0;
}
}
