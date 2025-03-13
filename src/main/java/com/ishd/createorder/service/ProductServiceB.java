package com.ishd.createorder.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ishd.createorder.dto.ProductDTO;
import com.ishd.createorder.entity.Products;

@Component("productserviceb")
public class ProductServiceB implements ProductService {

	@Override
	public Products createOrder(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO checkProductDto(int prodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
