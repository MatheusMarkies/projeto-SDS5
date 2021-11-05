package com.matheusmarkies.DSvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmarkies.DSvendas.dto.SellerDTO;
import com.matheusmarkies.DSvendas.services.SellerService;

@RestController
@RequestMapping (value = "/sellers")
public class SellerControllers {

	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = sellerService.findAll();
		return ResponseEntity.ok(list);
	}
	
}
