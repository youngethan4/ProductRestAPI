package com.tcs.productrestapi.service;

import java.util.List;
import java.util.Optional;

import com.tcs.productrestapi.model.Product;

public interface ProductService {

	public Product createProduct(Product product);
	public Optional<Product> getProductById(int id);
	public void deleteProduct(int id);
	public Optional<List<Product>> getProducts();
	public Optional<List<Product>> getProductsByCategory(String category);
	public Optional<List<Product>> getProductsGreaterThan(float price);
}
