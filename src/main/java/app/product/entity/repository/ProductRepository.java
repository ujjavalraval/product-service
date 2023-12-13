package app.product.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
