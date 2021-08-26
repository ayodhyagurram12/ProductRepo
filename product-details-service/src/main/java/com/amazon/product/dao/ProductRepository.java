
package com.amazon.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazon.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
