import java.util.Scanner;

public class homework_64 {

	 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int number=input.nextInt();
		input.close();
		reverse(number);
 
	}
	
	public static void reverse(int number) {
		String s="";
		while(number%10!=0) {
			s= s + number%10;
			number=number/10;
		}
		
		int count= Integer.parseInt(s);
		System.out.print(count);
	}
}
