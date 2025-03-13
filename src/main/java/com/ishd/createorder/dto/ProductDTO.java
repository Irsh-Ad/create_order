package com.ishd.createorder.dto;

import com.ishd.createorder.entity.Products;

import java.time.LocalDate;

public class ProductDTO {
    private int productId;
    private int prodCd;
    private String prodDesc;
    private LocalDate activeDate;
    private boolean activeStatus;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProdCd() {
        return prodCd;
    }

    public void setProdCd(int prodCd) {
        this.prodCd = prodCd;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public LocalDate getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(LocalDate activeDate) {
        this.activeDate = activeDate;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public static Products convertToProduct(ProductDTO productDTO) {
        Products pd = new Products();
        pd.setProductId(productDTO.getProductId());
        pd.setProdCd(productDTO.getProdCd());
        pd.setProdDesc(productDTO.getProdDesc());
        pd.setActiveDate(productDTO.getActiveDate());
        pd.setActiveStatus(productDTO.isActiveStatus());
        return pd;
    }

    public static ProductDTO convertToProductDTO(Products product) {
        ProductDTO pd = new ProductDTO();
        pd.setProductId(product.getProductId());
        pd.setProdCd(product.getProdCd());
        pd.setProdDesc(product.getProdDesc());
        pd.setActiveDate(product.getActiveDate());
        pd.setActiveStatus(product.isActiveStatus());
        return pd;
    }
}
