package com.tcs.productrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.productrestapi.model.Product;
import com.tcs.productrestapi.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		try {
			return productRepository.save(product);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Optional<Product> getProductById(int id) {
		Optional<Product> optional = null;
		try {
			optional = productRepository.findById(id);
			return optional;
		} catch(Exception e) {
			e.printStackTrace();
			return Optional.empty();
		}
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}

	@Override
	public Optional<List<Product>> getProducts() {
		return Optional.ofNullable(productRepository.findAll());
	}

	@Override
	public Optional<List<Product>> getProductsByCategory(String category) {
		return Optional.ofNullable(productRepository.findByCategory(category));
	}

	@Override
	public Optional<List<Product>> getProductsGreaterThan(float price) {
		return Optional.ofNullable(productRepository.findByPriceGreaterThan(price));
	}

}
