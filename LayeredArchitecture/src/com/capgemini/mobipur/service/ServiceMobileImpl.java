package com.capgemini.mobipur.service;

import java.util.List;

import com.capgemini.mobipur.bean.MobileBean;
import com.capgemini.mobipur.dao.IMobileDAO;
import com.capgemini.mobipur.dao.IpurchaseDetailsDAO;
import com.capgemini.mobipur.dao.MobileDAOImpl;
import com.capgemini.mobipur.dao.PurchaseDetailsDAOImpl;
import com.capgemini.mobipur.exception.MobilePurchaseException;

public class ServiceMobileImpl implements IServiceMobile {
	
	private IMobileDAO mobileDAO;
	
	public ServiceMobileImpl()
	{
		mobileDAO=new MobileDAOImpl();
	}

	@Override
	public List<MobileBean> viewAll() throws MobilePurchaseException {
		List<MobileBean> mobileList = mobileDAO.viewAll();
		return mobileList;
	}

	@Override
	public boolean deleteMobile(int mobileId) throws MobilePurchaseException {
		
		IpurchaseDetailsDAO purchaseDetailsDAO = new PurchaseDetailsDAOImpl();
		boolean isPurchaseDeleted = purchaseDetailsDAO.deletePurchaseDetails(mobileId);
		boolean isDeleted = mobileDAO.deleteMobile(mobileId);
		return(isDeleted && isPurchaseDeleted);
		
		
	}

	@Override
	public List<MobileBean> search(float minPrice, float maxPrice)
			throws MobilePurchaseException {
		// TODO Auto-generated method stub
		return null;
	}

}
