package com.rest.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;
import java.util.stream.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.restapi.model.Data;


@RestController
@RequestMapping("rest")
public class RestTestController {

	private List<String> list = new ArrayList<String>(Arrays.asList("Yeswanth", "Kaki","Bachi"));
	private List<Integer> number = new ArrayList<Integer>(Arrays.asList(2,3,4,5));
	
	@GetMapping("/data")
	public Data getData(@RequestParam("id") Integer id) {
		List<Integer> sq = number.stream().map(x -> x*x).collect(Collectors.toList());
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	    /*System.out.println(sq);
	    System.out.println(even);
	    list.stream().forEach(x -> System.out.print(x+" ")); */
	    
		Integer[] integerArray = {1,2,3};
		Arrays.stream(integerArray).forEach(System.out::println);
	    
		return new Data(id, list.get(id));
	} 
}
