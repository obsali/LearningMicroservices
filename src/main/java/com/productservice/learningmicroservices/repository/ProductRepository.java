package com.productservice.learningmicroservices.repository;

import com.productservice.learningmicroservices.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
