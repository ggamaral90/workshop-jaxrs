package br.com.workshop.jaxrs.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

/**
 * @author Gabriel Amaral 03/05/2016
 *
 */
public class Product implements Serializable {

	private static final long serialVersionUID = -9192965914823838398L;

	private UUID id;
	private String description;
	private BigDecimal price;
	
	public Product(String description, BigDecimal price) {
		this.id = UUID.randomUUID();
		this.description = description;
		this.price = price;
	}

	public UUID getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
}