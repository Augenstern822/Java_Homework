import java.util.Scanner;

public class homework_710 {

 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入十个数字：");
		
		double[] n=new double[10];
		for(int i=0; i<10; i++) {
			n[i]=input.nextDouble();
		}
		
		System.out.println("最小元素的下标值伟："+indexOfSmallestElement(n)); 
	}
	
	public static int indexOfSmallestElement(double[] array) {
		int indexOfSmall=0;
		double min=array[0];
		
		if(array.length>1) {
		for(int i=1; i<array.length; i++) {
			if(array[i]<min) {
				min=array[i];
				indexOfSmall=i;
			  }
		    }
			return indexOfSmall;
		}
		else {
			return 0;
		}	
	}
}
