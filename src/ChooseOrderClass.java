package receipthome;
import java.util.Scanner;

public class ChooseOrderClass {
		int type = 0;
		
		Scanner sc = new Scanner(System.in);

		public int InputNo() {
		    System.out.println("상품번호를 입력해주세요. : " );
		    int inputNo = sc.nextInt();
		    return inputNo;
		}
		public int inputCount() {
			System.out.println("몇개를 구매하시겠습니까? : " );
		    int count = sc.nextInt();	   
		     return count;
		}

		public void inputADD() {
		    System.out.print("1. 추가구매, 2. 구매종료 : " );
		    type = sc.nextInt();	 
		}
} 