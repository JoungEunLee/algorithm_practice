package sum;

//1+2+3+4+......+100까지의 합계를 구하는 순서도를 작성하시오

public class sum1{
	public static void main(String args[]){
		int i = 0;
		int j = 0;
		
		do {
			i++;
			j += i;
			
		} while (i < 100);
		
		System.out.printf("%d %d", i, j);
		
	}
}