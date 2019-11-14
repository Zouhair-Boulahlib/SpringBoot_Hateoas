package spring.hateoas.test.service;

import java.util.List;

import spring.hateoas.test.model.Product;

public interface IProductService {
	public List<Product> getAllProducts();
	public Product getProduct(Long idP);
	public Product addProduct(Product p);
	public Product updateProduct(Product p);
	public boolean deleteProduct(Long idP);
}
