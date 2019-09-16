package entity;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1234L;

	private String studentId;
	private String firstName;
	private String lastName;
	private int age;
	private Address address;
//
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStudentId() {
		return studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "entity.Student{" +
				"studentId='" + studentId + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", address=" + address.toString() +
				'}';
	}
}
