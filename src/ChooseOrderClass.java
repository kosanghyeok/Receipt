package receipthome;
import java.util.Scanner;

public class ChooseOrderClass {
		int type = 0;
		
		Scanner sc = new Scanner(System.in);

		public int InputNo() {
		    System.out.println("��ǰ��ȣ�� �Է����ּ���. : " );
		    int inputNo = sc.nextInt();
		    return inputNo;
		}
		public int inputCount() {
			System.out.println("��� �����Ͻðڽ��ϱ�? : " );
		    int count = sc.nextInt();	   
		     return count;
		}

		public void inputADD() {
		    System.out.print("1. �߰�����, 2. �������� : " );
		    type = sc.nextInt();	 
		}
} 