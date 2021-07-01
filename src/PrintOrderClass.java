package receipthome;

import java.util.ArrayList;

public class PrintOrderClass {

	int totalPrice = 0;

	public void printOrder(ArrayList<OrderListArrayClass> orderList) {
	
		System.out.printf("%23s \n", "STARBUCKS");
		System.out.println("");
		System.out.printf("%22s \n", "현금(소득공제)");
		System.out.println("서현N타운점                   T:1522-3232");
		System.out.println("분당 황새울로335번길 5");
		System.out.println("대표:송데이비드호섭            201-81-21515");
		System.out.println("[매장#9703, POS 02] 2021-06-21 08:41:48");
		System.out.printf("%s %10s %10s %9s \n", "이름", "가격", "수량", "금액");
		for(int index = 0; index < orderList.size(); index++) {
		System.out.printf("%s %10d %9d %11d \n", orderList.get(index).name, orderList.get(index).price, 
							orderList.get(index).count,orderList.get(index).total);
							} 
		System.out.println("--------------------------------------");
		System.out.print("결제금액") ;
	    System.out.printf("%32d \n", totalPrice);
		System.out.printf("(부가세포함)                         %.0f\n", totalPrice*0.091) ;
		System.out.println("--------------------------------------");
		System.out.println("제 휴 사                              0");
		System.out.println("--------------------------------------");
		System.out.println("카드  종류 :                   KAKAOTALK");
		System.out.println("회원  번호 :                9579****1502");
		System.out.println("승인  번호 :           20210621084148695");
		System.out.println("--------------------------------------");
		System.out.println("현금영수증 발급(자진발급)    :010-****-1234");
		System.out.printf("%s %8d %10s \n", "승인금액:", totalPrice, "승인번호:178461696");
		System.out.printf("%25s \n",  "현금영수증이 자진발급 되었습니다.");
		System.out.printf("%26s \n", "자진발급 분에 대한 소득공제 신청은");
		System.out.printf("%26s \n", "국세청홈텍스에서 확인해주시기 바랍니다.");
		System.out.printf("%26s \n", "현금영수증 문의 : 126-1-1");
		System.out.println("======================================");
		System.out.printf("%23s \n", "e-스티커는 결제 시");
		System.out.printf("%24s \n", "즉시 적립만 가능합니다.");
		System.out.printf("%25s \n", "결제수단 변경은 구입하신 매장에서");
		System.out.printf("%25s \n", "가능하며, 반드시 구매 영수증과");
		System.out.printf("%26s \n", "원거래 결제수단을 지참하셔야 합니다.");
		System.out.printf("%29s \n", "(변경 가능 기간 : ~2021-07-05)");
		System.out.println("");
		System.out.printf("%29s \n", "www.starbucks.co.kr");
		System.out.println("");
		System.out.println("");
		System.out.printf("%29s \n", "*26190460201290730");
		System.out.printf("%29s \n", "본 영수증은 BPA Free 종이를 사용합니다.");
		System.out.println("");
		System.out.printf("%24s \n", "고객요청에의해 일회용컵이 제공되었습니다");
		System.out.println("-------------------------------------");
		System.out.printf("%29s \n", "Wi-fi SSID : STARBUCKS");
		System.out.printf("%23s \n", "비밀번호   : 없음");
		
		}
	
	}


		
		
		
	

