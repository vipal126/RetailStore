package com.app.mediaocean.RetailStore.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.app.mediaocean.RetailStore.Utils.RetailStoreUtils;
import com.app.mediaocean.RetailStore.model.Product;

@Service
public class RetailService {

	public List<Product> generateBill(List<Product> products){
		if(products==null || products.isEmpty()){
			return Collections.emptyList(); 
		}
		Map<String, Integer> rateMap = RetailStoreUtils.getProductTaxRate();
		return products.stream().map(p->{
			p.setSalesTax(rateMap.get(p.getProductCategory()));
			double cost =  p.getCost() + (p.getCost() * p.getSalesTax())/100;
			p.setTotalCost((p.getQuantity()*cost));
			return p;
		}).collect(Collectors.toList());
	} 
}
