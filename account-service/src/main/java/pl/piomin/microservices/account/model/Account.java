package pl.piomin.microservices.account.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Account {

	@Override
	public String toString() {
		return "Account [id=" + id + ", customerId=" + customerId + ", number=" + number + "]";
	}

	@Id
	private String id;
	private String customerId;
	private String number;

	public Account() {

	}

	public Account(String id, String customerId, String number) {
		this.id = id;
		this.customerId = customerId;
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
