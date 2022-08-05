package com.rest.restapi.model;

public class Data {

	private Integer id;
	private String value;
	
	public Data(Integer id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
