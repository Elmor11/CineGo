package com.init.products.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.products.entity.Product;

@RestController
@RequestMapping("products")
public class ProductsREST {
	
		@GetMapping
		public ResponseEntity<Product> getProduct(){
			Product product=new Product();
			product.setId(1);
			product.setNombre("Iphone");
			return ResponseEntity.ok(product);
		}
}
