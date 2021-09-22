package com.mytoshika.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mytoshika.kafka.model.User;


@RestController
public class KafkaController {

	@Autowired
	private KafkaTemplate<String, Object> template;

	private String topic = "MyToshika_Kafka";

	@GetMapping("/publish/{name}")
	public String publishMessage(@PathVariable String name) {
		template.send(topic, "Hi " + name + " Welcome to MyToshika IT Solutions");
		return "Data Published Successfully";
	}

	@GetMapping("/publish/Json")
	public String publishMessage() {
		User user = new User(1324, "Shail2580", new String[] { "Noida", "Sector-71", "House JH-11" });
		template.send(topic, user);
		return "Json Data published Successfully";
	}
}
