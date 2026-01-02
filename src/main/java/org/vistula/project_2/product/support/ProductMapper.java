package org.vistula.project_2.product.support;

import org.springframework.stereotype.Component;
import org.vistula.project_2.product.api.request.ProductRequest;
import org.vistula.project_2.product.api.request.UpdateProductRequest;
import org.vistula.project_2.product.api.response.ProductResponse;
import org.vistula.project_2.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest){
        return new Product(productRequest.getName());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest){
        product.setName(updateProductRequest.getName());
        return product;
    }

    public ProductResponse toProductResponse(Product product){
        return new ProductResponse(product.getId(), product.getName());
    }
}