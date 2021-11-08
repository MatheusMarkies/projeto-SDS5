package com.matheusmarkies.DSvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmarkies.DSvendas.dto.SaleDTO;
import com.matheusmarkies.DSvendas.dto.SaleSuccessDTO;
import com.matheusmarkies.DSvendas.dto.SaleSumDTO;
import com.matheusmarkies.DSvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> list = service.amountGroupedSeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
		List<SaleSuccessDTO> list = service.successGroupedSeller();
		return ResponseEntity.ok(list);
	}
}
