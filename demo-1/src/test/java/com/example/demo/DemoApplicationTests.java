package com.example.demo;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

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
