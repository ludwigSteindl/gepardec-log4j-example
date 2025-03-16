package com.gepardec;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HelloExample2{
	
	final static Logger logger = LogManager.getLogger(HelloExample2.class);
	
	public static void main(String[] args) {
	
		HelloExample2 obj = new HelloExample2();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.error("Sorry, something wrong!", ex);
		}
		
		
	}
	
	private void divide(){
		
		int i = 10 /0;

	}
	
}