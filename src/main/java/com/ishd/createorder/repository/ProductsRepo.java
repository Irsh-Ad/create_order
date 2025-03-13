package com.ishd.createorder.repository;

import org.springframework.data.repository.CrudRepository;
import com.ishd.createorder.entity.Products;


public interface ProductsRepo extends CrudRepository<Products , Integer> {
	
}
