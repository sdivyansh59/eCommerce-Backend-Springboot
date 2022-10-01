package com.example.productdetailsservice.Services;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productdetailsservice.Entity.Product;
import com.example.productdetailsservice.Repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired //no need to use becaue it is interface
	ProductRepo productRepo ;
	
	public Product saveDataToDB(Product product) {
		product.setProductId(UUID.randomUUID());
		return productRepo.save(product);
	}
	
	public ArrayList<Product> findAllProduct(){
		return  productRepo.findAll();
	}

	public Product getProductDetails(UUID productId) {
		return productRepo.findByproductId(productId);
	}
}
