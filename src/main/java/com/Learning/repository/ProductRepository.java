package com.Learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Learning.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);
	

}
