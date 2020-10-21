public class homework_77 {

	 
	public static void main(String[] args) {
		
		int[] numbers=new int[100];
		int[] counts=new int[10];
		
		for(int i=0; i<100; i++) {
			numbers[i]=(int) (Math.random()*10);
			counts[numbers[i]]++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i+"出现的次数为:"+counts[numbers[i]]+" 次."); 
		}
				
	}
 
}
