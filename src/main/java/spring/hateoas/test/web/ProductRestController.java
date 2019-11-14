package spring.hateoas.test.web;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import spring.hateoas.test.model.Product;
import spring.hateoas.test.service.IProductService;

@RestController
@RequestMapping(value = "/products")
@RequiredArgsConstructor
public class ProductRestController {
	private final IProductService productService;
	
	@GetMapping(value = "")
	public List<Product> getAllProducts(){
		List<Product> products = productService.getAllProducts();
		products.forEach(product ->{
			Link selfLink = WebMvcLinkBuilder.linkTo(ProductRestController.class).withSelfRel();
			product.add(selfLink);
		});
		return products;
	}
	
	@GetMapping(value = "/{idP}")
	public Product getProduct(@PathVariable(value = "idP") Long idP) {
		Product product = productService.getProduct(idP);
		Link selfLink = WebMvcLinkBuilder.linkTo(ProductRestController.class).slash(product.getIdP())
										.withSelfRel();
		product.add(selfLink);
		return product;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
