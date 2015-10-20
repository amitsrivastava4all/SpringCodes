package com.srivastava.basics;

public class HomeLoan implements Loan {
	private RepaymentSchedule rep;

	HomeLoan(){
		System.out.println("Home Loan Cons Call");
	}
	@Override
	public void emi() {
		System.out.println("Home Loan EMI is 12000 Rs");
		
	}
	public RepaymentSchedule getRep() {
		return rep;
	}
	public void setRep(RepaymentSchedule rep) {
		this.rep = rep;
	}

}
