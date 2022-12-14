package com.tecnotab.concurrencyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tecnotab.concurrencyexchange.model.ExchangeValue;
import com.tecnotab.concurrencyexchange.repository.ExchangeValueRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepo;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {
		
		ExchangeValue exchangeValue = new ExchangeValue(1000L, "USD", "INR", BigDecimal.valueOf(70));
		//ExchangeValue exchangeValue = exchangeValueRepo.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		
		return exchangeValue;
	}
}
