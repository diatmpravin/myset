package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;

public class ASetShould {
	ASet s = new ASet();
	
	@Test
	public void beEmty(){
		HashMap<Integer, String> set = s.NewASet();
        assertEquals(0, set.size());
	}
	
	@Test
	public void haveOneItem(){
		HashMap<Integer, String> set = s.NewASet();
		set.put(1, "tutorials");
		assertEquals(1, set.size());
	}	
}
