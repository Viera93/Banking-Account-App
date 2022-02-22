package bankingapp;

public class CheckingAccount extends Account {
	//Properties specific to Checking account
	private int debitCardNumber;
	private int pin;
	
	//Constructor to initialize Checking Account properties
	public CheckingAccount(String name, String SSN, double initialDeposit) {
		super(name, SSN, initialDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	//Methods specific to Checking account
	//Checking account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN
	private void setDebitCard() {
		debitCardNumber= (int) (Math.random() * Math.pow(10, 12));
		pin = (int) (Math.random() * Math.pow(10, 4));
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking");
		System.out.println("DEBIT CARD NUMBER: " + debitCardNumber); 
		System.out.println("PIN: " + pin);
	}
    
	//Checking accounts will use 15% of the base rate
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
		
	}

}
