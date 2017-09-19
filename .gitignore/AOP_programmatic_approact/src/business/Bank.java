package business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Bank {
private int amount=5000;
private String acno="sbi123";

public int deposite(String acno,int amount) {
	if(acno.equals(this.acno))
	{ 
		System.out.println("in deposite Method");
		this.amount=this.amount+amount;
	return this.amount;
	}
	else {
		throw new AcnoNotFoundException();
	}
	
}
}
