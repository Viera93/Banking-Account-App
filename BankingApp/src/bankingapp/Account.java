package bankingapp;

public abstract class Account implements BaseInterestRate {
	
	//Common properties
	protected String accountNumber;
	private String name;
	private String SSN;
	private double initialDeposit;
	private static int uniqueNumberIndex = 10000;
	protected double rate;
	 
	//Constructor to initialize common properties
	public Account(String name, String SSN, double initialDeposit ) {
		this.name = name;
		this.SSN = SSN;
		this.initialDeposit = initialDeposit;
	
		//Setting the Account Number
		uniqueNumberIndex++;
		this.accountNumber = generateAccountNumber();
		setRate();
	}
	
	//Method to generate 11-digit account number
	private String generateAccountNumber() {
		//1. Generating 2 last digits of SSN
		String lastTwoDigits = SSN.substring(SSN.length()-2, SSN.length());
		//2. Generating a unique 5-digit number
	    int uniqueNumber = uniqueNumberIndex;
		//3.Generating a random 3-digit number
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		//4. Concatenating (1+2+3)
		return lastTwoDigits + uniqueNumber + randomNumber; 
	}
	
	// Methods for common properties
	public void deposit(double amount) {
		initialDeposit = initialDeposit + amount;
		System.out.println("Depositing £" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		initialDeposit = initialDeposit - amount;
		System.out.println("Withdrawin £" + amount);
		printBalance() ;
	}

	public void transfer(String toWhere, double amount) {
		initialDeposit = initialDeposit - amount;
		System.out.println("Transfering £" + amount + " to " + toWhere);
		printBalance() ;
	}
	
	public void printBalance() {
		System.out.println("Your balance is:£" + initialDeposit);
	}
	
	public abstract void setRate();
	
	public void compound() {
		double accruedInterest = initialDeposit * (rate/100);
		initialDeposit = initialDeposit + accruedInterest;
		System.out.println("Accrued interest: £" + accruedInterest);
		printBalance();
	}

	public void showInfo() {
		System.out.println("NAME: " + name + "\n" + "INITIAL DEPOSIT: " + initialDeposit
				+ "\n" + "ACCOUNT NUMBER: " + accountNumber);

	}

}
