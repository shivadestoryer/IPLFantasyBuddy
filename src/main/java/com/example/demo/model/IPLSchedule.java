package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class IPLSchedule {

	@Id
	@GeneratedValue
	private int mid;
	private  String venue;
	private String team1;
	private String team2;
	
	//@OneToMany(mappedBy="schedule")
	 @OneToMany(mappedBy = "schedule", targetEntity = Comment.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   @JsonIgnoreProperties("comment")
	private List<Comment> comment;

	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	private String date;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "IPLSchedule [mid=" + mid + ", venue=" + venue + ", team1=" + team1 + ", team2=" + team2 + ", date="
				+ date + "]";
	}
	
	
	
	
	
}
