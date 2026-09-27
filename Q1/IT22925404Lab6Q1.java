import java.util.Scanner;

public class IT22925404Lab6Q1{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double num = input.nextInt();
		
		System.out.println("");
		
		double square = num * num;
		System.out.println("The square of "+num+" is : "+square);
		
		double sqroot = Math.sqrt(num);
		System.out.println("The square root of "+num+" is : "+sqroot);
	}
}