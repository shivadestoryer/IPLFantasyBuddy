package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue
	private int cid;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="uid")
    @JsonIgnoreProperties("comment")
	private Users user;
	
	
	@ManyToOne
	@JoinColumn(name="mid")
    @JsonIgnoreProperties("comment")
	private IPLSchedule schedule;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	
	public IPLSchedule getSchedule() {
		return schedule;
	}
	public void setSchedule(IPLSchedule schedule) {
		this.schedule = schedule;
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", description=" + description + "]";
	}

	
	
}
