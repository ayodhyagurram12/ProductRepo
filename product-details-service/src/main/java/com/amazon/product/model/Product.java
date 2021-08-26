package com.amazon.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//import lombok.Data;

@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
//@Data
public class Product {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer productID;
 
 @Column(name = "product_Code")
 private String productCode;
 
 @Column(name = "name")
 private String name;
 
 @Column(name = "quantity")
 private Integer quantity;
 
 @Column(name = "price")
 private Float price;
 
 @Column(name = "image_Url")
 private String imageUrl;
 
 @Column(name = "description")
 private String description;
 
 

}

