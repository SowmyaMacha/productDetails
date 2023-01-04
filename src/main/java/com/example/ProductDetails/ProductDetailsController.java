package com.example.ProductDetails;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductDetailsController {
    private final ProductDetailRepository productDetailRepository;

    public ProductDetailsController(ProductDetailRepository productDetailRepository) {
        this.productDetailRepository = productDetailRepository;
    }

    @GetMapping(value = "/{id}")
    public Optional<ProductDetail> getProductDetail(@PathVariable int id){
        Optional<ProductDetail> productDetail = productDetailRepository.findById(id);
        return productDetail;
    }

    @PostMapping(value = "/newProduct")
    public String addProductDetail(@RequestBody ProductDetail productDetail){
        productDetailRepository.save(productDetail);
        return "Successfully added new product: "+ productDetail.getProductDetailsName();
    }

    @DeleteMapping(value = "/delete")
    public String deleteProduct(@RequestParam int id){
        Optional<ProductDetail> productDetail = productDetailRepository.findById(id);
        productDetailRepository.deleteById(id);
        return "product deleted: "+ productDetail.get().toString();
    }
}
