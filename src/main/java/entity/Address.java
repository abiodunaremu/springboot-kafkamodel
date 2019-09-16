package entity;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = 12345L;

	private String apartment;
	private String street;
	private String state;
	private String city;
	private String postCode;

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getApartment() {
		return apartment;
	}

	public String getStreet() {
		return street;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getPostCode() {
		return postCode;
	}

	@Override
	public String toString() {
		return "entity.Address{" +
				"apartment='" + apartment + '\'' +
				", street='" + street + '\'' +
				", state='" + state + '\'' +
				", city='" + city + '\'' +
				", postCode='" + postCode + '\'' +
				'}';
	}
}
