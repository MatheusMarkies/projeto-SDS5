package com.matheusmarkies.DSvendas.dto;

import java.io.Serializable;

import com.matheusmarkies.DSvendas.Entities.Seller;

public class SaleSumDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Double sum;
	
	public SaleSumDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleSumDTO(Seller seller, Double sum) {
		super();
		this.name = seller.getName();
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

}