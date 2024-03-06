package com.Learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Learning.model.Product;
import com.Learning.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	public List<Product> addProducts(@RequestBody List<Product> products){
		return service.saveProducts(products);
	}
}
