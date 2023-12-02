package model;

public class Ac {
	
	private int acNo;
	private String name;
	private long mobno;
	private long adharno;
	private char gender;
	private int age;
	private double balance;
	
	
	
	public void setAcno(int acNo) {
		this.acNo=acNo;
	}
	public int getAcno() {
		return acNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setMobno(long mobno) {
		this.mobno=mobno;
	}
	public long getMobno() {
		return mobno;
	}
	public void setAdharno(long adharno) {
		this.adharno=adharno;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public char getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
}
