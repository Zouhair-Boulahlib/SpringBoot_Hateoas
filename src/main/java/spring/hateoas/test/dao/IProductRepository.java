package spring.hateoas.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.hateoas.test.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {

}
