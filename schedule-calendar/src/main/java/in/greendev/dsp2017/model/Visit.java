package in.greendev.dsp2017.model;

import java.sql.Timestamp;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Visit {
	@Id
	@GeneratedValue
	private Long id;
	private Timestamp start;
	private Timestamp stop;
	
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Dietican dietican;
	
	@ManyToOne
	private Calendar calendar;
	
	private String summary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getStart() {
		return start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Timestamp getStop() {
		return stop;
	}

	public void setStop(Timestamp stop) {
		this.stop = stop;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Dietican getDietican() {
		return dietican;
	}

	public void setDietican(Dietican dietican) {
		this.dietican = dietican;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
}
