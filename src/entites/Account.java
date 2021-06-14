package entites;

public class Account {
	private static final double TAX = 5.00;
	private String name;
	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber, String name) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	public Account(String accountNumber, String name, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}


	public double getBalance() {
		return balance;
	}

	public double deposit(double balance) {
		this.balance += balance;
		
		return this.balance;	
	}
	
	public double toWithdraw(double balance) {
		this.balance -= (balance + TAX);
		
		return this.balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Account Number :" + accountNumber
				+" Account Name: " + name
				+" Account Balance: $ " + balance;
	}
	
	

}
