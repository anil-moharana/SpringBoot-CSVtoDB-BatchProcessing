package com.manthan.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.manthan.batch.model.CreditInfo;

public class CreditInfoProcessor implements ItemProcessor<CreditInfo, CreditInfo> {

	@Override
	public CreditInfo process(CreditInfo creditInfo) throws Exception {
		//final CreditInfo ci=new CreditInfo(creditInfo.getID(), nAME, lIMIT_BAL, sEX, eDUCATION, mARRIAGE, aGE, pAY_0, pAY_2, pAY_3, pAY_4, pAY_5, pAY_6, bILL_AMT1, bILL_AMT2, bILL_AMT3, bILL_AMT4, bILL_AMT5, bILL_AMT6, pAY_AMT1, pAY_AMT2, pAY_AMT3, pAY_AMT4, pAY_AMT5, pAY_AMT6, default_payment_next_month)
		
		System.out.println(creditInfo);
		return creditInfo;
	}

}
