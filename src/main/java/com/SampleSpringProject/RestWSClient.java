package com.SampleSpringProject;

import org.springframework.web.client.RestTemplate;

public class RestWSClient {

	public static void main(String[] args) {

			String uri = "http://services.groupkt.com/country/get/iso2code/IN";
	        RestTemplate restTemplate = new RestTemplate();
	        
	        String consumeJSONString = restTemplate.getForObject(uri, String.class);
	        System.out.println("JSON String: "+consumeJSONString);
	       	        
	        String result = restTemplate.getForObject("http://api.geonames.org/citiesJSON?north=44.1&south=-9.9&east=-22.4&west=55.2&lang=de&username=demo", String.class);
	        System.out.println("JSON String: "+result);
	        
	    }
}
