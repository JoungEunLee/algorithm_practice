package sum;

//1+2+4+7+11+16+22...의 순서로 나열되는 수열의 20번째 할까지의 합계를 구해라

public class sum3{
	public static void main(String args[]){
		int i = 0;
		int j = 1;
		int k = 1;
		
		do {
			i++;
			j += i;
			k += j;
			
		} while (i < 19);
		
		System.out.print(k);
		
		
		
	}
}