package com.ishd.createorder.service;

import com.ishd.createorder.dto.ProductDTO;
import com.ishd.createorder.entity.Products;

import java.util.List;

public interface ProductService {
    public Products createOrder(ProductDTO productDTO);
    public ProductDTO checkProductDto(int prodId);
    public List<ProductDTO> getAll();
}
