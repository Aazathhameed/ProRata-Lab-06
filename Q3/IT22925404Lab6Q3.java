import java.util.Scanner;

public class IT22925404Lab6Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		int sumofSquare = 0;
		
		System.out.println("Enter a positive integers (terminate input with -99)");
		
		while(true){
			System.out.print("Enter a number: ");
			int num = input.nextInt();
			
			if(num==-99){
				break;
			}
			if(num<0){
				System.out.println("Please enter a positive integer or -99 to terminate");
				continue;
			}
			
			sumofSquare = sumofSquare+(num*num);
			count++;
		}
			
		if(count>0){
			double rms = Math.sqrt((double)sumofSquare/count);
			System.out.println();
			System.out.println("The Root Mean Sqaure (RMS) is: "+rms);
		}else{
			System.out.println("No valid numbers has been entered");
		}
		
		input.close();
	}
}