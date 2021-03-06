package com.matheusmarkies.DSvendas.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusmarkies.DSvendas.Entities.Seller;
import com.matheusmarkies.DSvendas.Repositories.SellerRepositories;
import com.matheusmarkies.DSvendas.dto.SellerDTO;

@Service
public class SellerService {

	@Autowired
	private SellerRepositories sellerRepositories;
	
	public List<SellerDTO> findAll(){
		List<Seller> result = sellerRepositories.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}
