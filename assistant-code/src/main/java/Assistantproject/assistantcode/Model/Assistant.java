package Assistantproject.assistantcode.Model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
@Table(name="assistant")
public class Assistant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="mobile")
	private Integer Mobile;
	
	@Column(name="email")
	private String Email;
	
	@Column(name="salary")
	private Integer Salary;
	
	@Column(name="city")
	private String City;
	
	@Column(name="country")
	private String Country;
	
	@Column(name="department")
	private String Department;
	
	@Column(name="role")
	private String Role;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getMobile() {
		return Mobile;
	}

	public void setMobile(Integer mobile) {
		Mobile = mobile;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getSalary() {
		return Salary;
	}

	public void setSalary(Integer salary) {
		Salary = salary;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public Assistant(Integer id, String name, Integer mobile, String email, Integer salary, String city, String country,
			String department, String role) {
		super();
		Id = id;
		Name = name;
		Mobile = mobile;
		Email = email;
		Salary = salary;
		City = city;
		Country = country;
		Department = department;
		Role = role;
	}

	public Assistant() {
		super();
	}
	
}
