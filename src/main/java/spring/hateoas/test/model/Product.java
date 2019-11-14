package spring.hateoas.test.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Product extends RepresentationModel<Product> implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idP;
	private String designation;
	private String description;
	private double price;
	private int quantity;
	
	public Product(String designation, String description, double price, int quantity) {
		this.designation = designation;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
}