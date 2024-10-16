package com.model;

public class Product {

	private long productID;
	private String productName;
	private int productQty;
	private double productPrice;
	private String mfgDate;
	private String expDate;

	
	
		

public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

public Product(String productName, int productQty, double productPrice, String mfgDate,String expDate) {
		super();
		
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	}



  public Product(long productId, String productName, int productQty, double productPrice, String mfgDate,
		String expDate) {
	  this.productID = productId;
	  this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
	
}

public long getProductID() {
		return productID;
	}


	public void setProductID(long productID) {
		this.productID = productID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getProductQty() {
		return productQty;
	}


	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public String getMfgDate() {
		return mfgDate;
	}


	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}


	public String getExpDate() {
		return expDate;
	}


	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}


	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", mfgDate=" + mfgDate + ", expDate=" + expDate + "]";
	}
	
	
	
}
