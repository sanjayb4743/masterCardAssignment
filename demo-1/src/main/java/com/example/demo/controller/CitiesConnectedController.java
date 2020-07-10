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
	String originCity="";
	String desitinationCity="";
	String orgDest="";
	Set<String> routes;
	public final static  String YES="yes";
	public final static String NO="no";
	@GetMapping(value = "/connected")
	public String connection(@RequestParam Map<String, String> customQuery) {
		originCity = customQuery.get("origin");
		desitinationCity = customQuery.get("destination");
		orgDest = originCity + "," + " " + desitinationCity;
		routes = new HashSet<String>();
		File file = new File("src/main/resources/city.txt");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				routes.add(sc.nextLine());
			}
			if (routes.contains(orgDest)) {
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
