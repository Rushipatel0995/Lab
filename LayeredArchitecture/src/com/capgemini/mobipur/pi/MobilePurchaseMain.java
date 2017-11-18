package com.capgemini.mobipur.pi;

import java.time.LocalDate;

import com.capgemini.mobipur.bean.PurchaseDetailsBean;
import com.capgemini.mobipur.exception.MobilePurchaseException;
import com.capgemini.mobipur.service.IServicePurchaseMobile;
import com.capgemini.mobipur.service.ServicePurchaseImpl;

public class MobilePurchaseMain {

	public static void main(String[] args) {
		PurchaseDetailsBean pdb=new PurchaseDetailsBean( "abc","abc@ab.com","99844458",1002);

		try{
			IServicePurchaseMobile isp=new ServicePurchaseImpl();
			boolean isInserted= isp.insertPurchaseDetails(pdb);
			if(isInserted){
				System.out.println("Record inserted successfully");
			}
		}catch(MobilePurchaseException mpe)
		{
			System.out.println(mpe.getMessage());
		}
	}

}
