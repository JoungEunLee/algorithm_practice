package sum;

//1-2+3-4+5-6....+99-100까지의 합계를 구하는 순서도를 작성하시오

public class sum2{
	public static void main(String args[]){
		int i = 0;
		int j = 0;
		int sw = 0;
		
		do {
			i++;
			if (sw == 0) {
				j += i;
				sw = 1;
			} else {
				j -= i;
				sw = 0;
			}
			
		} while (i < 100);
		
		System.out.printf("%d %d", i, j);
		
	}
}