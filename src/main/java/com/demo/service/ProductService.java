package com.demo.service;

import com.demo.model.Product;

public interface ProductService {

	Product getByName(String name);
	void refreshAllProducts();
	Product updateProduct(Product product);
	String getJson();
	void clearJson();
	
}
