package receipthome;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner; 

public class ReceiptMainClass {

		public static void main(String[] args) { 

				ArrayList<OrderListArrayClass> orderList = new ArrayList<OrderListArrayClass>(); 
				ChooseOrderClass inputOr = new ChooseOrderClass(); 
				PrintOrderClass printOr = new PrintOrderClass(); 
				OrderListClass listOr = new OrderListClass(); 

				while(true) {

					OrderListArrayClass item = new OrderListArrayClass(0,null,0,0,0);	
					listOr.ListOrder(inputOr,item);

					orderList.add(item);

					inputOr.inputADD();

				    if (inputOr.type == 1) { continue; } 
				    else if(inputOr.type == 2) { break;} 

				} printOr.printOrder(orderList);


		}
	} 

