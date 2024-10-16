package com.controller;


import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.utility.ProductUtility;

public class ProductController {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		ProductService productService = new ProductService();
		
		
		int choice;
		
		boolean wantToTerminate = false;
		
		do {
			
			System.out.println("Press 1 for add Product");
			
			System.out.println("Press 2 for get Product");
			
			System.out.println("Press 0 for Terminate");
			
			choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1 : {
				
			Product product =	ProductUtility.prepareProductData();
			
				String msg = productService.addProduct(product);
				
				System.out.println(msg);
				break;
			}
			
			case 2 : {
				System.out.println("Enter Id");
				
				long productId = scanner.nextLong();
				
				Object obj = productService.getProductById(productId);	
				
				System.out.println(obj);
				
				break;
			}
			
			case 0: {
				wantToTerminate = false;
				
			}
			
			default:
			
			System.out.println("Invalid choice ...");
			}
			
		}while(wantToTerminate);
	
    }
	}
