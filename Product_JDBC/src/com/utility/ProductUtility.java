package com.utility;

import java.util.Scanner;

import com.model.Product;

public class ProductUtility {
	
	public static Product prepareProductData() {
		
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter Product ID");
//		long productId = sc.nextLong();
		
		System.out.println("Enter Product Name");
		String productName = sc.next();
		
		System.out.println("Enter Product Qty");
		int productQty = sc.nextInt();
		
		System.out.println("Enter Product Price");
		double productPrice = sc.nextDouble();
		
		System.out.println("Enter Product MFG Date");
		String mfgDate = sc.next();
		
		System.out.println("Enter Product EXP Date");
		String expDate = sc.next();
		
		Product product = new Product(productName, productQty, productPrice, mfgDate, expDate );
		
		return product;
	}
//(productId, productName, productQty, productPrice, mfgDate, expDate)
}
