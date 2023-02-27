import java.util.Scanner;

public class Practise {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	
	try {
		int x = s.nextInt();
		int y= s.nextInt();
		System.out.println(x/y);
//		System.out.println();
		
	} catch (Exception e) {
//		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}

}}
