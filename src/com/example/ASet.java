package com.example;

import java.util.HashMap;

public class ASet {
	
	HashMap<String, Boolean> m = new HashMap<String, Boolean>();
	
	// Return size of Set
	public Integer Size(){
		return m.size();
	}

	public void Add(String str) {
		m.put(str, true);
	}

	public String Contain(String str) {
		Boolean v = m.get(str);
		if (v != null){
			return str;
		} else {
			return "";
		}
		
	}
}
