package com.capgemini.mobipur.dao;

import com.capgemini.mobipur.bean.PurchaseDetailsBean;
import com.capgemini.mobipur.exception.MobilePurchaseException;

public interface IpurchaseDetailsDAO {
	public boolean insertPurchase(final PurchaseDetailsBean purchaseDeatailsBean) throws MobilePurchaseException;
	
	
	
	public boolean deletePurchaseDetails(final int mobileId) throws MobilePurchaseException;
	
}
