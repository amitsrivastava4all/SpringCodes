package com.srivastava.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class UseLoan {

	public static void main(String[] args) {
		//Loan loan = new HomeLoan(); // Tightly Coupled
		ApplicationContext b = new ClassPathXmlApplicationContext("spring.xml");
		//BeanFactory b =new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//System.out.println("Bean Factory Loaded....");
		HomeLoan loan1 = (HomeLoan)b.getBean("loan");
		loan1.emi();
		Loan loan2 = (Loan)b.getBean("loan");
		loan2.emi();
		if(loan1 == loan2){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		loan1.getRep().printSchedule();
		/*loan = (Loan)b.getBean("loan2");
		loan.emi();*/
	}

}
