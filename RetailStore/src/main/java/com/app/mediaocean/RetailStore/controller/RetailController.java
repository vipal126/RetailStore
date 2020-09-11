package com.app.mediaocean.RetailStore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.mediaocean.RetailStore.model.Product;
import com.app.mediaocean.RetailStore.service.RetailService;

@RestController()
public class RetailController {
	
	@Autowired
	private RetailService service;
	public Map<String, String> getProductCost(@RequestBody List<Product> product){
		Map<String,String>  response = new HashMap<String, String>();
		if(product==null || product.isEmpty()){
			response.put("status","failed");
			response.put("reason","product list is empty");
			return response;
		}
		response.put("status","success");
		response.put("response", service.generateBill(product).toString());
		return response;
	}
	
	
}
