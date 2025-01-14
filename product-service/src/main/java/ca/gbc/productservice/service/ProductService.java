package ca.gbc.productservice.service;

import ca.gbc.productservice.dto.ProductRequest;
import ca.gbc.productservice.dto.ProductResponse;
import ca.gbc.productservice.model.Product;
import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest productRequest);
    List<ProductResponse> getAllProducts();
    String updateProduct(String productId, ProductRequest productRequest);
    void deleteProduct(String productId);
}
