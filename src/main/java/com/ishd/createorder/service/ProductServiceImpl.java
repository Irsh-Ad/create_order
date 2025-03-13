package com.ishd.createorder.service;

import com.ishd.createorder.dto.ProductDTO;
import com.ishd.createorder.entity.Products;
import com.ishd.createorder.repository.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@Service("servicea")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductsRepo productsRepo;

    @Override
    public Products createOrder(ProductDTO productDTO) {
        Products products = ProductDTO.convertToProduct(productDTO);
        products = productsRepo.save(products);
        return products;
    }

    @Override
    public ProductDTO checkProductDto(int prodId) {
        Optional<Products> opDate = productsRepo.findById(prodId);
        return opDate.map(ProductDTO::convertToProductDTO).orElse(null);
    }

    @Override
    public List<ProductDTO> getAll() {
        List<ProductDTO> pd = new ArrayList<>();
        Iterable<Products> it = productsRepo.findAll();
        for (Products products : it) {
            pd.add(ProductDTO.convertToProductDTO(products));
        }
        return pd;
    }
}
