package in.greendev.dsp2017.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Integer telephone;
	private Date birthDate;
	private Integer height;
	private Integer weight;
	
	@OneToMany(mappedBy = "client")
	private List<Visit> visitsList;
	
	@OneToMany(mappedBy = "client")
	private List<TestHealth> testshealthList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTelephone() {
		return telephone;
	}

	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public List<Visit> getVisitsList() {
		return visitsList;
	}

	public void setVisitsList(List<Visit> visitsList) {
		this.visitsList = visitsList;
	}

	public List<TestHealth> getTestshealthList() {
		return testshealthList;
	}

	public void setTestshealthList(List<TestHealth> testshealthList) {
		this.testshealthList = testshealthList;
	}
	
	

}
