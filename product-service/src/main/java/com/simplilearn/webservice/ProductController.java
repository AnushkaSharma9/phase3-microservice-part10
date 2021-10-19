package com.simplilearn.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.webservice.entity.Product;

@RestController
public class ProductController {
	
		@GetMapping("/products")
		List<Product> listAccount() { 
			List<Product> list = new ArrayList<Product>();
			list.add(new Product(10001, "Mac book xyz series"));
			list.add(new Product(10002, "Lenovo book xyz series"));
			list.add(new Product(10003, "Dell book xyz series"));
			list.add(new Product(10004, "Acer book xyz series"));
			list.add(new Product(10005, "Hp book xyz series"));
			return list;
		}
	}
