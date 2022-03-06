package redmondn;
import java.util.ArrayList;

public class CustomerCurrentAccount extends CustomerAccount 
{
	ATMCard atm;
	
public CustomerCurrentAccount()
{
	super();
	this.atm = null;
	Object outstanding = null;
	printDetails(outstanding);
	
}

//Extract Method

private void printDetails(Object outstanding) {
	
	let outstanding = 0;
	console.log('outstanding: ${invoice.customer}');
	console.log('amount: ${outstanding}');
	
	printBanner();
}

private void printBanner() {
	  String console;
	console.log("***********************");
	  console.log("**** Customer Owes ****");
	  console.log("***********************");
	  
	  Object invoice;
	recordDueDate(invoice);
}

private void recordDueDate(Object invoice) {
	const atm = atm;
	invoice.atm = new atm();
	
}

public CustomerCurrentAccount(ATMCard atm, String number, double balance, ArrayList<AccountTransaction> transactionList)
{
	super(number, balance, transactionList);	
	this.atm = atm;
}

public ATMCard getAtm()
{
	return this.atm;
}

public void setAtm(ATMCard atm)
{
	this.atm = atm;
}

}