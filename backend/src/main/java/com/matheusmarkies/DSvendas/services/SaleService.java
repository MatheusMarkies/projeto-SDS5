package com.matheusmarkies.DSvendas.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.matheusmarkies.DSvendas.Entities.Sale;
import com.matheusmarkies.DSvendas.Entities.Seller;
import com.matheusmarkies.DSvendas.Repositories.SaleRepositories;
import com.matheusmarkies.DSvendas.Repositories.SellerRepositories;
import com.matheusmarkies.DSvendas.dto.SaleDTO;
import com.matheusmarkies.DSvendas.dto.SaleSuccessDTO;
import com.matheusmarkies.DSvendas.dto.SaleSumDTO;
import com.matheusmarkies.DSvendas.dto.SellerDTO;

@Service
public class SaleService {

	@Autowired
	private SaleRepositories saleRepositories;
	
	@Autowired
	private SellerRepositories sellerRepositories;
	
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepositories.findAll();
		Page<Sale> result = saleRepositories.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

	@Transactional (readOnly = true)
	public List<SaleSumDTO> amountGroupedSeller(){
		return saleRepositories.amountGroupedSeller();
	}
	
	@Transactional (readOnly = true)
	public List<SaleSuccessDTO> successGroupedSeller(){
		return saleRepositories.successGroupedSeller();
	}
	
}
