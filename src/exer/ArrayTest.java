package exer;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int [10];
		
		int b[] = {10,20,30,40,50}; //배열의 선언과 동시에 초기화

		int c[] = {1,6,9,3,8,2};
		
		
		for(int i=0; i<5; i++) {
			System.out.println(b[i]);
		}
		
		for(int j=0; j<c.length; j++) {
			System.out.println(c[j]);
		}
	}

}
