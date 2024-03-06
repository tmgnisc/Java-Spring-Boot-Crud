package com.Learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Learning.model.Product;
import com.Learning.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
		return service.saveProducts(products);
	}
	
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	
	public Product findProductById(int id) {
		return service.getProductByID(id);
	}
	
	public Product findProductByName(String name) {
		return service.getProductByName(name);
	}
}
