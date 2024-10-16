package com.service;

import java.text.SimpleDateFormat;

import com.dao.ProductDao;
import com.model.Product;

public class ProductService {
	
	ProductDao productDao = new ProductDao();
	
	public String  addProduct(Product product) {
		
	    String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		
     	product.setProductID(Long.parseLong(productId));

		
		String msg = productDao.addProduct(product);
		
		return msg;
	}	
	
	public Object getProductById(long productId) {
		
		 Object obj = productDao.getProductById(productId);
		
		return obj;
	}
	
	public String deleteProductById(long productId){
		
		return null;
	}
	
	public String updateProduct(Product product) {
		
		return null;
	}
}