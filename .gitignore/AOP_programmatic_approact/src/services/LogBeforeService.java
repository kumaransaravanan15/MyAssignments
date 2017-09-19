package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] param, Object o) throws Throwable {
		// TODO Auto-generated method stub
		Log l = LogFactory.getLog(Bank.class);
		l.info("deposite method....");

	}

}
