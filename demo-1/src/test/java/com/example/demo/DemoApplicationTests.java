package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.CitiesConnectedController;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)

class DemoApplicationTests {
	
	@InjectMocks
	private CitiesConnectedController connnectedController;
	
	
	
	@Test
	void testPositive() {
		Map mapData=new HashMap<String,String>();
		mapData.put("origin", "Boston");
		mapData.put("destination","New York");
		assertEquals(connnectedController.connection(mapData),"yes"); 
		
	}
	
	@Test
	void testNegative() {
		Map mapData=new HashMap<String,String>();
		mapData.put("origin", "Delhi");
		mapData.put("destination","Hyderabad");
		assertEquals(connnectedController.connection(mapData),"no"); 
		
		
	}
	

}
