package com.broadridge.margin;

import java.io.Serializable;

public class AccountContext implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String accountNumber;
	private String fedCallStatus;
	private String cashCallStatus;
	private String processRuleFedCallStatus;
	private String processRuleCashCallStatus;
	private String businessRuleFedStatus;
	private String businessRuleCashStatus;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFedCallStatus() {
		return fedCallStatus;
	}
	public void setFedCallStatus(String fedCallStatus) {
		this.fedCallStatus = fedCallStatus;
	}
	public String getCashCallStatus() {
		return cashCallStatus;
	}
	public void setCashCallStatus(String cashCallStatus) {
		this.cashCallStatus = cashCallStatus;
	}
	
	public String getProcessRuleFedCallStatus() {
		return processRuleFedCallStatus;
	}
	public void setProcessRuleFedCallStatus(String processRuleFedCallStatus) {
		this.processRuleFedCallStatus = processRuleFedCallStatus;
	}
	public String getProcessRuleCashCallStatus() {
		return processRuleCashCallStatus;
	}
	public void setProcessRuleCashCallStatus(String processRuleCashCallStatus) {
		this.processRuleCashCallStatus = processRuleCashCallStatus;
	}
	
	public String getBusinessRuleFedStatus() {
		return businessRuleFedStatus;
	}
	public void setBusinessRuleFedStatus(String businessRuleFedStatus) {
		this.businessRuleFedStatus = businessRuleFedStatus;
	}
	public String getBusinessRuleCashStatus() {
		return businessRuleCashStatus;
	}
	public void setBusinessRuleCashStatus(String businessRuleCashStatus) {
		this.businessRuleCashStatus = businessRuleCashStatus;
	}
	@Override
	public String toString() {
		return "AccountContext [accountNumber=" + accountNumber
				+ ", fedCallStatus=" + fedCallStatus + ", cashCallStatus="
				+ cashCallStatus + ", processRuleFedCallStatus="
				+ processRuleFedCallStatus + ", processRuleCashCallStatus="
				+ processRuleCashCallStatus + ", businessRuleFedStatus="
				+ businessRuleFedStatus + ", businessRuleCashStatus="
				+ businessRuleCashStatus + "]";
	}
	
	
	

}
