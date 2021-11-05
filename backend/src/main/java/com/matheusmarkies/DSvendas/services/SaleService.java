package com.matheusmarkies.DSvendas.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.matheusmarkies.DSvendas.Entities.Sale;
import com.matheusmarkies.DSvendas.Entities.Seller;
import com.matheusmarkies.DSvendas.Repositories.SaleRepositories;
import com.matheusmarkies.DSvendas.Repositories.SellerRepositories;
import com.matheusmarkies.DSvendas.dto.SaleDTO;
import com.matheusmarkies.DSvendas.dto.SellerDTO;

@Service
public class SaleService {

	@Autowired
	private SaleRepositories saleRepositories;
	
	public Page<SaleDTO> findAll(Pageable pageable){
		Page<Sale> result = saleRepositories.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
}
