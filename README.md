# Banking-Account-App

This Banking Account Application is reading a .csv file with the following properties: Name, SSN, Account Type and initial Deposit.
Application should:
•	create two types of accounts: 1 – Saving Account, 2 – Checking Account
•	both types of accounts should perform following functions: deposit(), withdraw(), transfer(), and showInfo().
•	both types of accounts should have 11-digit account number, that is generated according to followings rules:
   1.	the account number should start with the number 1 or number 2, depending on the type of the account (1 for Saving, 2 for Checking)
   2.	the account number should contain last 2 digits of SSN number
   3.	the account number should contain a 5-digit unique number and 3-digit random number
•	saving account holders are given a safety deposit box, that is identified by a 3-digit number and accessed with a 4-digit PIN.
•	checking account holders are assigned a Debit Card with a 12-digit number and 4-digit PIN.
•	Saving accounts are using 0.25 points less than the base rate, Checking Accounts are using 15% of the base rate. The base rate is 2.5.

