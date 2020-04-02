package com.chcpc.mvcdemobasic.entity;

public class School {
	private String name;
	private String address;
	public School(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", address=" + address + "]";
	}

	
}
