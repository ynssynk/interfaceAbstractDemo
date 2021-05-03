package interfaceAbstractDemo.Entities;

import java.sql.Date;

import interfaceAbstractDemo.Abstract.IEntity;

public class Customer implements IEntity{
	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	public Customer( Date dateOfBirth,String firstName, String lastName, String nationalityId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	public Customer() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
}
