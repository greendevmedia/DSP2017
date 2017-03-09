package in.greendev.dsp2017.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Calendar {
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy = "calendar")
	private List<Visit> visitsList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Visit> getVisitsList() {
		return visitsList;
	}

	public void setVisitsList(List<Visit> visitsList) {
		this.visitsList = visitsList;
	}
	
	
	

}
