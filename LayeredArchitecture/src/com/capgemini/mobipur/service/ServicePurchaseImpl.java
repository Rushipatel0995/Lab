package com.capgemini.mobipur.service;

import com.capgemini.mobipur.bean.PurchaseDetailsBean;
import com.capgemini.mobipur.dao.IMobileDAO;
import com.capgemini.mobipur.dao.IpurchaseDetailsDAO;
import com.capgemini.mobipur.dao.MobileDAOImpl;
import com.capgemini.mobipur.dao.PurchaseDetailsDAOImpl;
import com.capgemini.mobipur.exception.MobilePurchaseException;

public class ServicePurchaseImpl implements IServicePurchaseMobile {

	@Override
	public boolean insertPurchaseDetails(PurchaseDetailsBean purchaseDetailsBean)
			throws MobilePurchaseException {
		
		int mobileQuantity=0;
		boolean isItInserted=false;
		boolean isUpdated=false;
		
		IpurchaseDetailsDAO purchaseDetailsDAO = new PurchaseDetailsDAOImpl();
		IMobileDAO mobileDAO=new MobileDAOImpl();
		mobileQuantity = mobileDAO.getQuantity(purchaseDetailsBean.getMobileId());
		
		if(mobileQuantity>0)
		{
			isItInserted=purchaseDetailsDAO.insertPurchase(purchaseDetailsBean);
			mobileQuantity--;
			isUpdated=mobileDAO.updateMobile(purchaseDetailsBean.getMobileId(),mobileQuantity);
		}
		
		
		
		//boolean isItInserted = purchaseDetailsDAO.insertPurchase(purchaseDetailsBean);
				return (isUpdated && isItInserted);
		
	}

}
