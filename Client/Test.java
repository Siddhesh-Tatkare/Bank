package Client;
import Service.Rbi;
import java.util.Scanner;
import Service.HDFC;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbi r=new HDFC();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println(".........................HDFC BANK INFORMATION................................");	
		System.out.println("1.CREATE ACCOUNT.\n2.All DETAILS.\n3.DEPOSIT MONEY.\n4.WITHDRAW.\n5.CHECK BALANCE.");
		System.out.println("ENTER YOUR OPTION.........");
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1:
				r.createAc();
				break;
		case 2:
				System.out.println("__________________________DISPLAY ALL INFORMATION____________________________:");
				r.displayDetails();
				break;
		case 3:
				System.out.println("__________________________ENTER AMOUNT____________________________:");
				r.depositMoney(sc.nextDouble());
				break;
		case 4:
				System.out.println("__________________________ENTER AMOUNT____________________________:");
				r.withdraw(sc.nextDouble());
				break;
		case 5:
				System.out.println("__________________________ACCOUNT BALANCE____________________________:");
				r.balanceCheck();
				break;
		default:
				System.out.println("OPTION NOT FOUNDS:");
				
		}
	}

}
}