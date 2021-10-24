package com.spring.cloudconfig;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance-service")
public class ProviderController {
	@GetMapping("/getAllPlans")
	public List<String> getServerDeatils() {
		return Stream.of("Premium","Silver","Gold").collect(Collectors.toList());
	}
	
}
