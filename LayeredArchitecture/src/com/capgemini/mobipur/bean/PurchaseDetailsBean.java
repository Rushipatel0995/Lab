package com.capgemini.mobipur.bean;

import java.time.LocalDate;

public class PurchaseDetailsBean {
	public PurchaseDetailsBean() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "PurchaseDetailsBean [purchaseId=" + purchaseId + ", name="
				+ name + ", mailId=" + mailId + ", phoneNo=" + phoneNo
				+ ", purDate=" + purDate + ", mobileId=" + mobileId + "]";
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMailId() {
		return mailId;
	}


	public void setMailId(String mailId) {
		this.mailId = mailId;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}




	public int getMobileId() {
		return mobileId;
	}


	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}


	public PurchaseDetailsBean( String name, String mailId,
			String phoneNo,  int mobileId) {
		super();
		
		this.name = name;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		
		this.mobileId = mobileId;
	}


	private int purchaseId;
	private String name;
	private String mailId;
	private String phoneNo;
	private LocalDate purDate;//from jdk 1.8
	private int mobileId;

}
