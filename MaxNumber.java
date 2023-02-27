import java.util.Scanner;

public class MaxNumber {
	public static void largerNumber(int num1, int num2) {
		int max = (num1 > num2)? num1:num2;
		System.out.println("Larger number between " + num1 + " and " +num2 +" is : " +max);
	}

    public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a first number :");
	int num1 = sc.nextInt();
	System.out.println("Enter a second number :");
	int num2 = sc.nextInt();
	
	MaxNumber.largerNumber(num1, num2);
    }
}