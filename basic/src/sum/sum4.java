package sum;

//1+1+2+3+5+8+13+...의 순서로 나열되는 피보나치 수열의 20번째 항까지의 합계를 구해라

public class sum4 {
	public static void main(String args[]) {
		int hap, cnt, c;
		int a = 1, b = 1;
		hap = 2;
		cnt = 2;
		// a,b,c를 한묶음으로 묶어서 a는 첫번째, b는 두번재, c는 세번째 (=a,b의 합)

		// break 만나기 전까지 무한반복
		while (true) {
			c = a + b;
			hap += c;
			cnt++;
			if (cnt < 20) {
				a = b;
				b = c;
			} else {
				System.out.print(hap);
				break;
			}
		}
	}
}