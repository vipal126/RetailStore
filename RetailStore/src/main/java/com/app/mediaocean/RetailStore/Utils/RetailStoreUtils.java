package com.app.mediaocean.RetailStore.Utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vipal kaila
 */
public class RetailStoreUtils {

	
	/** 
	 * @return Map<String,Integer>
	 * @author vipal kaila
	 */
	public static Map<String,Integer> getProductTaxRate(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A",10);
		map.put("B",20);
		map.put("C", 0);
		return Collections.unmodifiableMap(map);
	}
	
}
