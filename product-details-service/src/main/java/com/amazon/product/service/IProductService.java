package com.amazon.product.service;

import java.util.List;

import com.amazon.product.model.Product;

public interface IProductService {

	List<Product> getAllProducts();

	Product getProductById(Integer productId);

	void saveProduct(Product product);

	void updatProduct(Product product);

	void deleteProduct(Integer productId);

}
