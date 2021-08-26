package com.amazon.product.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping(value = "/products")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class ProductController {

 @ApiOperation(value = "View a list of available products",response = Product.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
 @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
 @ResponseBody
 public List<Product> getAllProducts() {
  
  List<Product> productList = null;

  return productList;

 }

 
 @ApiOperation(value = "Search a product with an ID",response = Product.class)
  @ApiResponses(value = {
             @ApiResponse(code = 200, message = "Successfully retrieved a product "),
             @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
             @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
             @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
     }
     )
 @RequestMapping(value = "/show/{productId}", method = RequestMethod.GET, produces = "application/json")
 @ResponseBody
 public Product getProductById(@PathVariable("productId") Integer productId) {
  
  Product product = null;

  return product;

 }

 @ApiOperation(value = "Add a product")
  @ApiResponses(value = {
             @ApiResponse(code = 200, message = "Successfully added Product"),
             @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
             @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
             @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
     }
     )
 @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
 @ResponseBody
 public ResponseEntity saveProduct(@RequestBody Product product) {

  return new ResponseEntity("Product saved successfully", HttpStatus.OK);

 }

 @ApiOperation(value = "Update a product")
  @ApiResponses(value = {
             @ApiResponse(code = 200, message = "Successfully updated the product"),
             @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
             @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
             @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
     }
     )
 @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
 @ResponseBody
 public ResponseEntity updatProduct(@RequestBody Product product) {
  return new ResponseEntity("Product updated successfully", HttpStatus.OK);

 }

 @ApiOperation(value = "delete a product")
  @ApiResponses(value = {
             @ApiResponse(code = 200, message = "Successfully deleted the product"),
             @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
             @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
             @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
     }
     )
 @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
 @ResponseBody
 public ResponseEntity deleteProduct() {
  return new ResponseEntity("Product deleted successfully", HttpStatus.OK);

 }

}
