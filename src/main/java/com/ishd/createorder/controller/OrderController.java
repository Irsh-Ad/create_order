package com.ishd.createorder.controller;

import com.ishd.createorder.dto.ProductDTO;
import com.ishd.createorder.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ishd.createorder.service.ProductService;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "/create_order")
public class OrderController {

    @Autowired
    @Qualifier("servicea")
    private ProductService productService;
    
    @Autowired
	@Qualifier("productserviceb")
	private ProductService pd;

    @GetMapping(path = "/getProducts/{prodId}")
    public ResponseEntity<ProductDTO> getOrder(@PathVariable(name = "prodId") int prodId) {
    	System.out.println(pd.getAll());
    	System.out.println(productService);
        ProductDTO pdDto = productService.checkProductDto(prodId);
        return new ResponseEntity<ProductDTO>(Objects.requireNonNullElseGet(pdDto, ProductDTO::new), HttpStatus.OK);
    }
    @PostMapping(path = "/createOrder")
    public Products createOrder (@RequestBody(required = true) ProductDTO productDTO){
        System.out.println("Create Order initiated");
        return productService.createOrder(productDTO);
    }

    @GetMapping(path = "/getAllProducts")
    public ResponseEntity<List<ProductDTO>> getAllProducts(){
        return new ResponseEntity<List<ProductDTO>> (productService.getAll(), HttpStatus.OK) ;
    }
}
