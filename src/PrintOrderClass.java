package receipthome;

import java.util.ArrayList;

public class PrintOrderClass {

	int totalPrice = 0;

	public void printOrder(ArrayList<OrderListArrayClass> orderList) {
	
		System.out.printf("%23s \n", "STARBUCKS");
		System.out.println("");
		System.out.printf("%22s \n", "����(�ҵ����)");
		System.out.println("����NŸ����                   T:1522-3232");
		System.out.println("�д� Ȳ�����335���� 5");
		System.out.println("��ǥ:�۵��̺��ȣ��            201-81-21515");
		System.out.println("[����#9703, POS 02] 2021-06-21 08:41:48");
		System.out.printf("%s %10s %10s %9s \n", "�̸�", "����", "����", "�ݾ�");
		for(int index = 0; index < orderList.size(); index++) {
		System.out.printf("%s %10d %9d %11d \n", orderList.get(index).name, orderList.get(index).price, 
							orderList.get(index).count,orderList.get(index).total);
							} 
		System.out.println("--------------------------------------");
		System.out.print("�����ݾ�") ;
	    System.out.printf("%32d \n", totalPrice);
		System.out.printf("(�ΰ�������)                         %.0f\n", totalPrice*0.091) ;
		System.out.println("--------------------------------------");
		System.out.println("�� �� ��                              0");
		System.out.println("--------------------------------------");
		System.out.println("ī��  ���� :                   KAKAOTALK");
		System.out.println("ȸ��  ��ȣ :                9579****1502");
		System.out.println("����  ��ȣ :           20210621084148695");
		System.out.println("--------------------------------------");
		System.out.println("���ݿ����� �߱�(�����߱�)    :010-****-1234");
		System.out.printf("%s %8d %10s \n", "���αݾ�:", totalPrice, "���ι�ȣ:178461696");
		System.out.printf("%25s \n",  "���ݿ������� �����߱� �Ǿ����ϴ�.");
		System.out.printf("%26s \n", "�����߱� �п� ���� �ҵ���� ��û��");
		System.out.printf("%26s \n", "����ûȨ�ؽ����� Ȯ�����ֽñ� �ٶ��ϴ�.");
		System.out.printf("%26s \n", "���ݿ����� ���� : 126-1-1");
		System.out.println("======================================");
		System.out.printf("%23s \n", "e-��ƼĿ�� ���� ��");
		System.out.printf("%24s \n", "��� ������ �����մϴ�.");
		System.out.printf("%25s \n", "�������� ������ �����Ͻ� ���忡��");
		System.out.printf("%25s \n", "�����ϸ�, �ݵ�� ���� ��������");
		System.out.printf("%26s \n", "���ŷ� ���������� �����ϼž� �մϴ�.");
		System.out.printf("%29s \n", "(���� ���� �Ⱓ : ~2021-07-05)");
		System.out.println("");
		System.out.printf("%29s \n", "www.starbucks.co.kr");
		System.out.println("");
		System.out.println("");
		System.out.printf("%29s \n", "*26190460201290730");
		System.out.printf("%29s \n", "�� �������� BPA Free ���̸� ����մϴ�.");
		System.out.println("");
		System.out.printf("%24s \n", "����û������ ��ȸ������ �����Ǿ����ϴ�");
		System.out.println("-------------------------------------");
		System.out.printf("%29s \n", "Wi-fi SSID : STARBUCKS");
		System.out.printf("%23s \n", "��й�ȣ   : ����");
		
		}
	
	}


		
		
		
	

