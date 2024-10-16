package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import com.config.DbConnection;
import com.model.Product;

public class ProductDao {
	
	Connection con = DbConnection.getConnection(); //alt + shift L
	
    public String addProduct(Product product) {
		
    	String msg = null;
    	
    	try {
    	
        	
        	String sqlQuery = " INSERT INTO product  (product_id, product_name, product_qty, product_price, mfg_date, exp_date) VALUES (?,?,?,?,?,?)";
        	
    		
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setLong(1, product.getProductID());
			ps.setString(2, product.getProductName());
			ps.setInt(3, product.getProductQty());
			ps.setDouble(4, product.getProductPrice());
			ps.setString(5, product.getMfgDate());
			ps.setString(6, product.getExpDate());
			
			int affectedRows = ps.executeUpdate();
			
			if(affectedRows>0) {
				msg = "added successfully";
			}
			
		} 
    	catch(SQLIntegrityConstraintViolationException e){
    		
    		msg = "Data Already Exists";
    		
    	}
    	catch(SQLException e) {
    		
    		e.printStackTrace();
    		
    		msg = "SQL Exception Occoured";
    		
    	}
    	catch (Exception e) {
			
			msg = "Something went wrong";
    		//e.printStackTrace();
		}
    	
		return msg;
	}
	
	public Object getProductById(long productId) {
		
		try {
			String query = "SELECT * FROM product WHERE product_Id = ?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setLong(1, productId);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) { //purpose :  if there are any object in resultSet then point out it.
			    
			long pid = rs.getLong("product_id");
			
			String productName = rs.getString("product_name");
				
			int productQty = rs.getInt("product_qty");
			
			double productPrice = rs.getDouble("product_price");
			
			String mfgDate = rs.getString("mfg_date");
			
			String expDate = rs.getString("exp_date");
			
			Product product = new Product(productId, productName, productQty, productPrice, mfgDate, expDate);
			
			return product;
			
			}else {
				
				return "Product Not Found For ID = "+productId;
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			return "Something went wrong";
		}
		
	}	
	
	public String deleteProductById(long productId){
		
		return null;
	}
	
	public String updateProduct(Product product) {
		
		return null;
	}
	
 

}
