package com.redhat.training.model;

import java.io.Serializable;

public class Workorder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1750352119550019034L;
	
	private String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
