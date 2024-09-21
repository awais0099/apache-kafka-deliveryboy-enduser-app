package com.deliveryboy.deliveryboy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.deliveryboy.config.AppConstants;

@Service
public class KafkaService {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public boolean updateLocation() {
		int randomNumber1 = (int)(Math.random() * 100) + 1;
		int randomNumber2 = (int)(Math.random() * 100) + 1;
        String location = Integer.toString(randomNumber1) + ", " + Integer.toString(randomNumber2);
		
        System.out.println("** location **");
		System.out.println(location);
		
		kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
		return true;
	}
}
