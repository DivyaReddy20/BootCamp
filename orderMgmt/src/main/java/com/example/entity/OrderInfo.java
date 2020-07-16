package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Orderinfo")
public class OrderInfo {
 
	@Id
	@GeneratedValue
	private Integer orderId;
	@Column(length=20)
	private String receipentName;
	@Column(length=10)
	private long receipentphNo;
	@Column(length=20)
	private String streetAddress;
	@Column(length=10)
	private String city;
	@Column(length=10)
	private String zipCode;
	
	
	 @OneToOne(cascade = {CascadeType.ALL})
	    @JoinColumn(name = "customerId")
		private CustomerInfo customer;


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public String getReceipentName() {
		return receipentName;
	}


	public void setReceipentName(String receipentName) {
		this.receipentName = receipentName;
	}


	public long getReceipentphNo() {
		return receipentphNo;
	}


	public void setReceipentphNo(long receipentphNo) {
		this.receipentphNo = receipentphNo;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public CustomerInfo getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerInfo customer) {
		this.customer = customer;
	}


	public OrderInfo(Integer orderId, String receipentName, long receipentphNo, String streetAddress, String city,
			String zipCode, CustomerInfo customer) {
		super();
		this.orderId = orderId;
		this.receipentName = receipentName;
		this.receipentphNo = receipentphNo;
		this.streetAddress = streetAddress;
		this.city = city;
		this.zipCode = zipCode;
		this.customer = customer;
	}


	public OrderInfo() {
		super();
	}
	
	 
	 
}
