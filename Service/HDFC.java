package Service;
import java.util.Scanner;

import model.Ac;
public class HDFC implements Rbi{
	Ac obj=new Ac();
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void createAc() {
		// TODO Auto-generated method stub
		System.out.println("AccountNo:");
		obj.setAcno(sc.nextInt());
		System.out.println("AccountName:");
		sc.nextLine();
		obj.setName(sc.nextLine());
		System.out.println("MobNo:");
		obj.setMobno(sc.nextLong());
		System.out.println("AdharNo:");
		obj.setAdharno(sc.nextLong());
		System.out.println("Gender:");
		obj.setGender(sc.next().charAt(0));
		System.out.println("Age");
		obj.setAge(sc.nextInt());
		System.out.println("Balance");
		obj.setBalance(sc.nextDouble());
		
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("AccountNo:"+obj.getAcno());
		System.out.println("AccountName:"+obj.getName());
		System.out.println("MobNo:"+obj.getMobno());
		System.out.println("AdharNo:"+obj.getAdharno());
		System.out.println("Gender:"+obj.getGender());
		System.out.println("Age:"+obj.getAge());
		System.out.println("Balance:"+obj.getBalance());
	}

	@Override
	public void depositMoney(double amount) {
		
		// TODO Auto-generated method stub
		double sum=0;
		//System.out.println("__________________________Enter amount____________________________:");
		if(amount<obj.getBalance()) {
			System.out.println("______________________Amount Deposit Successfuly________________________");
			sum=amount + obj.getBalance();
			System.out.println("Amount Deposit :"+"Rs"+sum);
		}
		else if(amount==obj.getBalance()) {
			System.out.println("Payment procesing:");
		}
		else {
			System.out.println("______________________failed________________________________________");
		}
		obj.setBalance(sum);
		System.out.println(obj.getBalance());
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		double sub=0;
		//System.out.println("______________Enter Amount______________________________:");
		if(amount<obj.getBalance()) {
		System.out.println("______________Amount Withdraw Successfuly_______________:");	
		sub=obj.getBalance()-amount;
		System.out.println("WithdrawMoney:"+"Rs"+sub);
		}
		else {
			System.out.println("____________________failed____________________________:");
		}
		obj.setBalance(sub);
		System.out.println(+obj.getBalance());
	}

	@Override
	public void balanceCheck() {
		// TODO Auto-generated method stub
		//System.out.println("______________________Account Balance Show__________________________");
		System.out.println("BalanceCheck:"+obj.getBalance());
		
	}

}
