package bankingapp;

public class SavingAccount extends Account {
	//Properties specific to Checking account
    private int safetyDepositBoxNumber;
    private int safetyDepositBoxCode;
	
	//Constructor to initialize Saving Account properties
	public SavingAccount(String name, String SSN, double initialDeposit) {
		super(name, SSN, initialDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
 	
	// Saving account holders are given a safety deposit box;
	// identified by a 3-digit number and accessed with a 4-digit code
	private void setSafetyDepositBox() {
		safetyDepositBoxNumber = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxCode = (int)(Math.random() * Math.pow(10, 4));
	}
	
	// Methods specific to Checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Saving");
		System.out.println("SAFETY DEPOSIT BOX NUMBER: " + safetyDepositBoxNumber);
		System.out.println("SAFETY DEPOSIT BOX CODE: " + safetyDepositBoxCode);
	}

	//Saving accounts will use .25 points less than the base rate
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}

}
