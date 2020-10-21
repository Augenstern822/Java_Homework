import java.util.Scanner;

public class homework_617 {

	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("«Î ‰»În:");
		int n=input.nextInt();
		
		printMatrix(n);
 
	}
 
	private static void printMatrix(int n) {
		
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=n; j++) {
				System.out.printf("%2d", (int) (Math.random()*2));
			}
			System.out.println();
		}
			
		
	}
}
