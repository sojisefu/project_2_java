package org.vistula.project_2.product.support;

import org.vistula.project_2.product.support.exeption.ProductNotFoundException;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> productNotFound(Long id){
        return () -> new ProductNotFoundException(id);
    }
}