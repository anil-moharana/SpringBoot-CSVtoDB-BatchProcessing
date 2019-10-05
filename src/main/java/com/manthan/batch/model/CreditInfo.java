package com.manthan.batch.model;

import java.io.Serializable;


public class CreditInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	public CreditInfo() {
	}

	private int ID;
	private String NAME;
	private double LIMIT_BAL;
	private int SEX;
	private int EDUCATION;
	private int MARRIAGE;
	private int AGE;
	private int PAY_0;
	private int PAY_2;
	private int PAY_3;
	private int PAY_4;
	private int PAY_5;
	private int PAY_6;
	private double BILL_AMT1;
	private double BILL_AMT2;
	private double BILL_AMT3;
	private double BILL_AMT4;
	private double BILL_AMT5;
	private double BILL_AMT6;
	private double PAY_AMT1;
	private double PAY_AMT2;
	private double PAY_AMT3;
	private double PAY_AMT4;
	private double PAY_AMT5;
	private double PAY_AMT6;
	private Integer default_payment_next_month;

	public CreditInfo(int iD, String nAME, double lIMIT_BAL, int sEX, int eDUCATION, int mARRIAGE, int aGE, int pAY_0,
			int pAY_2, int pAY_3, int pAY_4, int pAY_5, int pAY_6, double bILL_AMT1, double bILL_AMT2, double bILL_AMT3,
			double bILL_AMT4, double bILL_AMT5, double bILL_AMT6, double pAY_AMT1, double pAY_AMT2, double pAY_AMT3,
			double pAY_AMT4, double pAY_AMT5, double pAY_AMT6, int default_payment_next_month) {

		ID = iD;
		NAME = nAME;
		LIMIT_BAL = lIMIT_BAL;
		SEX = sEX;
		EDUCATION = eDUCATION;
		MARRIAGE = mARRIAGE;
		AGE = aGE;
		PAY_0 = pAY_0;
		PAY_2 = pAY_2;
		PAY_3 = pAY_3;
		PAY_4 = pAY_4;
		PAY_5 = pAY_5;
		PAY_6 = pAY_6;
		BILL_AMT1 = bILL_AMT1;
		BILL_AMT2 = bILL_AMT2;
		BILL_AMT3 = bILL_AMT3;
		BILL_AMT4 = bILL_AMT4;
		BILL_AMT5 = bILL_AMT5;
		BILL_AMT6 = bILL_AMT6;
		PAY_AMT1 = pAY_AMT1;
		PAY_AMT2 = pAY_AMT2;
		PAY_AMT3 = pAY_AMT3;
		PAY_AMT4 = pAY_AMT4;
		PAY_AMT5 = pAY_AMT5;
		PAY_AMT6 = pAY_AMT6;
		this.default_payment_next_month = default_payment_next_month;
	}

	public int getID() {
		return ID;
	}

	public String getNAME() {
		return NAME;
	}

	public double getLIMIT_BAL() {
		return LIMIT_BAL;
	}

	public int getSEX() {
		return SEX;
	}

	public int getEDUCATION() {
		return EDUCATION;
	}

	public int getMARRIAGE() {
		return MARRIAGE;
	}

	public int getAGE() {
		return AGE;
	}

	public int getPAY_0() {
		return PAY_0;
	}

	public int getPAY_2() {
		return PAY_2;
	}

	public int getPAY_3() {
		return PAY_3;
	}

	public int getPAY_4() {
		return PAY_4;
	}

	public int getPAY_5() {
		return PAY_5;
	}

	public int getPAY_6() {
		return PAY_6;
	}

	public double getBILL_AMT1() {
		return BILL_AMT1;
	}

	public double getBILL_AMT2() {
		return BILL_AMT2;
	}

	public double getBILL_AMT3() {
		return BILL_AMT3;
	}

	public double getBILL_AMT4() {
		return BILL_AMT4;
	}

	public double getBILL_AMT5() {
		return BILL_AMT5;
	}

	public double getBILL_AMT6() {
		return BILL_AMT6;
	}

	public double getPAY_AMT1() {
		return PAY_AMT1;
	}

	public double getPAY_AMT2() {
		return PAY_AMT2;
	}

	public double getPAY_AMT3() {
		return PAY_AMT3;
	}

	public double getPAY_AMT4() {
		return PAY_AMT4;
	}

	public double getPAY_AMT5() {
		return PAY_AMT5;
	}

	public double getPAY_AMT6() {
		return PAY_AMT6;
	}

	public Integer getDefault_payment_next_month() {
		return default_payment_next_month;
	}

	public void setID(int iD) {
	
		ID = iD;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public void setLIMIT_BAL(double lIMIT_BAL) {
		LIMIT_BAL = lIMIT_BAL;
	}

	public void setSEX(int sEX) {
		SEX = sEX;
	}

	public void setEDUCATION(int eDUCATION) {
		EDUCATION = eDUCATION;
	}

	public void setMARRIAGE(int mARRIAGE) {
		MARRIAGE = mARRIAGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}

	public void setPAY_0(int pAY_0) {
		PAY_0 = pAY_0;
	}

	public void setPAY_2(int pAY_2) {
		PAY_2 = pAY_2;
	}

	public void setPAY_3(int pAY_3) {
		PAY_3 = pAY_3;
	}

	public void setPAY_4(int pAY_4) {
		PAY_4 = pAY_4;
	}

	public void setPAY_5(int pAY_5) {
		PAY_5 = pAY_5;
	}

	public void setPAY_6(int pAY_6) {
		PAY_6 = pAY_6;
	}

	public void setBILL_AMT1(double bILL_AMT1) {
		BILL_AMT1 = bILL_AMT1;
	}

	public void setBILL_AMT2(double bILL_AMT2) {
		BILL_AMT2 = bILL_AMT2;
	}

	public void setBILL_AMT3(double bILL_AMT3) {
		BILL_AMT3 = bILL_AMT3;
	}

	public void setBILL_AMT4(double bILL_AMT4) {
		BILL_AMT4 = bILL_AMT4;
	}

	public void setBILL_AMT5(double bILL_AMT5) {
		BILL_AMT5 = bILL_AMT5;
	}

	public void setBILL_AMT6(double bILL_AMT6) {
		BILL_AMT6 = bILL_AMT6;
	}

	public void setPAY_AMT1(double pAY_AMT1) {
		PAY_AMT1 = pAY_AMT1;
	}

	public void setPAY_AMT2(double pAY_AMT2) {
		PAY_AMT2 = pAY_AMT2;
	}

	public void setPAY_AMT3(double pAY_AMT3) {
		PAY_AMT3 = pAY_AMT3;
	}

	public void setPAY_AMT4(double pAY_AMT4) {
		PAY_AMT4 = pAY_AMT4;
	}

	public void setPAY_AMT5(double pAY_AMT5) {
		PAY_AMT5 = pAY_AMT5;
	}

	public void setPAY_AMT6(double pAY_AMT6) {
		PAY_AMT6 = pAY_AMT6;
	}

	public void setDefault_payment_next_month(String default_payment_next_month) {
		this.default_payment_next_month = Integer.parseInt(default_payment_next_month);
	}

	@Override
	public String toString() {
		return "CreditInfo [ID=" + ID + ", NAME=" + NAME + ", LIMIT_BAL=" + LIMIT_BAL + ", SEX=" + SEX + ", EDUCATION="
				+ EDUCATION + ", MARRIAGE=" + MARRIAGE + ", AGE=" + AGE + ", PAY_0=" + PAY_0 + ", PAY_2=" + PAY_2
				+ ", PAY_3=" + PAY_3 + ", PAY_4=" + PAY_4 + ", PAY_5=" + PAY_5 + ", PAY_6=" + PAY_6 + ", BILL_AMT1="
				+ BILL_AMT1 + ", BILL_AMT2=" + BILL_AMT2 + ", BILL_AMT3=" + BILL_AMT3 + ", BILL_AMT4=" + BILL_AMT4
				+ ", BILL_AMT5=" + BILL_AMT5 + ", BILL_AMT6=" + BILL_AMT6 + ", PAY_AMT1=" + PAY_AMT1 + ", PAY_AMT2="
				+ PAY_AMT2 + ", PAY_AMT3=" + PAY_AMT3 + ", PAY_AMT4=" + PAY_AMT4 + ", PAY_AMT5=" + PAY_AMT5
				+ ", PAY_AMT6=" + PAY_AMT6 + ", default_payment_next_month=" + default_payment_next_month + "]";
	}

}
