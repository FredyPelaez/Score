package com.fredyPCode.Score.producer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SchoolResponseProducer {

	@Autowired
	private KafkaTemplate<String, String> KafkaTemplate;
	
	final static Logger logger = LogManager.getLogger(SchoolResponseProducer.class);
	
	String kafkaTopic = "score-response-topic";
	
	public void send(String message) {
		KafkaTemplate.send(kafkaTopic, message);
	}
}
