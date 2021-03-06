package com.matheusmarkies.DSvendas.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.matheusmarkies.DSvendas.Entities.Sale;
import com.matheusmarkies.DSvendas.Entities.Seller;
import com.matheusmarkies.DSvendas.dto.SaleSuccessDTO;
import com.matheusmarkies.DSvendas.dto.SaleSumDTO;

public interface SaleRepositories extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.matheusmarkies.DSvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedSeller();

	@Query("SELECT new com.matheusmarkies.DSvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedSeller();	
}
