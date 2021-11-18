package com.init.products.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.products.dao.ProductsDAO;
import com.init.products.entity.Product;

@RestController
@RequestMapping("reservas")
public class ProductsREST {
	@Autowired
	private ProductsDAO productsDAO;
	
		@GetMapping
		public ResponseEntity<List<Product>> getProduct(){
			List<Product> reservas = productsDAO.findAll();
			return ResponseEntity.ok(reservas);
		}
}
