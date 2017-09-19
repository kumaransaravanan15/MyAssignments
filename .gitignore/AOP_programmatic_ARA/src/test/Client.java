package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogAfterService;

public class Client {
public static void main(String[] args) {
	//create target
	Bank b = new Bank();
	//create advice
	LogAfterService lbs = new LogAfterService();
	//add target+advice to proxy
	ProxyFactoryBean pfb = new  ProxyFactoryBean();
	pfb.setTarget(b);
	pfb.addAdvice(lbs);
	//get Generated proxy object
	Bank bproxy = (Bank)pfb.getObject();
    int amount =bproxy.deposite("sbi123", 5000);
    System.out.println(amount);
}
}
