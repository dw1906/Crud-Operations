package com.second.service;

import java.util.ArrayList;  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.second.objects.Product;
import com.second.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<Product>();
		productRepo.findAll().forEach(pro1 -> products.add(pro1));
		return products;
	}
	
	public Product getProductById(int id) {
		return productRepo.findById(id).get();
	}
	
	public void SaveProduct(Product product) {
		productRepo.save(product);
	}
	
}
