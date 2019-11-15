package spring.hateoas.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import spring.hateoas.test.dao.IProductRepository;
import spring.hateoas.test.model.Product;
import spring.hateoas.test.service.IProductService;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {
	private final IProductRepository productRepository;
	
	@Transactional(readOnly=true)
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	@Transactional(readOnly=true)
	@Override
	public Product getProduct(Long idP) {
		return productRepository.findById(idP).get();
	}

	@Override
	public Product addProduct(Product p) {
		return productRepository.save(p);
	}

	@Override
	public Product updateProduct(Product p) {
		return productRepository.save(p);
	}

	@Override
	public boolean deleteProduct(Long idP) {
		productRepository.deleteById(idP);
		return true;
	}

}
