package homework;

import java.util.Date;
 
public class Account {
		
	public int id=0;
	public double balance=0;
	public double annualInteresRate=0;
	public java.util.Date dateCreated;
	
	public Account(){
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
	}
	
	public Account(int id, double balance){
		Date dateCreated=new Date();
		this.dateCreated=dateCreated;
		this.id=id;
		this.balance=balance;
	}
	
	public int getId(){
		return id;
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public double getAnualInterestRate() {
		return annualInteresRate;
		
	}
	
	
	public void setId(int id){
		this.id=id;
	}
	
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInteresRate=annualInterestRate;
	}
 
	public String getDateCreated(){
		return dateCreated.toString();
		}
	
	public double getMonthlyInterestRate() {
		return annualInteresRate/12;
		
	}
	
	public double withDraw(double withdraw) {
		return this.balance=this.balance-withdraw;
	}
	
	public double deposit(double deposit) {
		return this.balance=this.balance+deposit;
	}

	public static void main(String[] args) {
		
		Account object=new Account(10, 90000 );
	
		object.setAnnualInterestRate(3.3/100);
		
		object.withDraw(3200);
		
		object.deposit(4000);
		
		System.out.println("余额："+object.getBalance()+"美元");
		System.out.println("月利息："+object.getMonthlyInterestRate()*100+"%");   
		System.out.print("开户时间："+object.getDateCreated());
	}
}