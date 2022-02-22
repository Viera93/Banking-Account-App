package bankingapp;

public interface BaseInterestRate {
	
	//Method that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}

}
