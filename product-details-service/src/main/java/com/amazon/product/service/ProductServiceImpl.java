package com.amazon.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.product.dao.ProductRepository;
import com.amazon.product.model.Product;

@Service
public class ProductServiceImpl implements IProductService {
 
 @Autowired
 ProductRepository productRepository;

 
@Override
 public List<Product> getAllProducts() {
  
  
  List<Product> productList = productRepository.findAll();
  
  return productList;
 }

 
@Override
 public Product getProductById(Integer productId) {
  
  Product product = productRepository.findOne(productId);
  
  return product;
 }

 
@Override
 public void saveProduct(Product product) {
  
  productRepository.save(product);
  
 }

 
@Override
 public void updatProduct(Product product) {
  
  productRepository.save(product);
 }

 
@Override
 public void deleteProduct(Integer productId) {
  
  productRepository.delete(productId);
  
 }

}
