package bankingapp;

import java.util.LinkedList;
import java.util.List;

public class BankingApplication {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		String file = "Data.csv";

		// Read a CSV file, then create new accounts based on that data
		List<String[]> newAccountHolders = utilities.Data.readData(file);

		for (String[] accountHolder : newAccountHolders) {

			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initialDeposit = Double.parseDouble(accountHolder[3]);

			if (accountType.equalsIgnoreCase("Savings")) {
				accounts.add(new SavingAccount(name, SSN, initialDeposit));
			} else if (accountType.equalsIgnoreCase("Checking")) {
				accounts.add(new CheckingAccount(name, SSN, initialDeposit));
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}

		for (Account acc : accounts) {
			System.out.println("***********************");
			acc.showInfo();
		}

	}

}
