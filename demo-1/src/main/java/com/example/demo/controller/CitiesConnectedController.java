/**
 * 
 */
package com.example.demo.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sanjay
 *
 */
@RestController
public class CitiesConnectedController {

	@GetMapping(value = "/connected")

	public String connection(@RequestParam Map<String, String> customQuery) {
		
		String originCity=customQuery.get("origin");
		String desitinationCity=customQuery.get("destination");
		String orgDest=originCity+","+" "+desitinationCity;
		Set<String> routes=new HashSet<String>();
		File file = new File("src/main/resources/city.txt"); 
		final String YES="yes";
		final String NO="NO";
	    try {
	    	 Scanner sc = new Scanner(file);
	    	 while(sc.hasNextLine()) {
	    		 routes.add(sc.nextLine());
	    	 }
	    	 if(routes.contains(orgDest)) {
	    		 return YES;
	    	 }
	    	 return NO;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return e.getLocalizedMessage();
		} 
		  

	}
	
	@GetMapping(value="/test")
	
	    public String test() {
		return "success";
	}
}
