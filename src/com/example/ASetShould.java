package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ASetShould {
	ASet set = new ASet();
	
	
	@Test
	public void beEmty(){
        assertEquals(Integer.valueOf(0), set.Size());
	}
	
	@Test
	public void addItem(){
		set.Add("pravin");
		set.Add("deo");
		set.Add("manoj");
		assertEquals(Integer.valueOf(3), set.Size());
	}
	
	@Test 
	public void noDuplicateItem(){
		set.Add("pravin");
		set.Add("deo");
		set.Add("manoj");
		set.Add("deo");
		assertEquals(Integer.valueOf(3), set.Size());
	}
	
	@Test
	public void containItem(){
		set.Add("pravin");
		set.Add("deo");
		set.Add("manoj");
		
		assertEquals("pravin", set.Contain("pravin"));
		assertEquals("manoj", set.Contain("manoj"));
	}
	
	@Test
	public void noContain() {
		set.Add("pravin");
		set.Add("deo");
		set.Add("manoj");
		
		assertEquals("", set.Contain("pravin1"));
		assertEquals("", set.Contain("manoj1"));
	}
}
