package com.tecnotab.concurrencyexchange.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ExchangeValue {
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	
	public ExchangeValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	
	
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple="
				+ conversionMultiple + "]";
	}
	
	
}
