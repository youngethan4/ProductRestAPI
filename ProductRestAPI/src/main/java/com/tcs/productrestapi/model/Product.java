package com.tcs.productrestapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//inform to jpa that this class is used for jpa repository. (ORM mapping purpose)
@Entity
@Table(name = "product_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	//denotes that productId is the primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="product_id")
	private int productId;
	@Column(name = "product_name")
	private String productName;
	private String description;
	private float price;
	private String category;
	
}
