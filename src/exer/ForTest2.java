package exer;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100까지의 합을 구하는 for문
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
		
		for(int j=100;j>=1;j--) {
			sum2= sum2+j;
		}
		
		System.out.println(sum);
		System.out.println(sum2);
	}

}
