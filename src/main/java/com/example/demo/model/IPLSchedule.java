package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IPLSchedule {

	@Id
	@GeneratedValue
	private int mid;
	private  String venue;
	private String teams;

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
		return teams;
	}
	public void setTeam1(String teams) {
		this.teams = teams;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "IPLSchedule [mid=" + mid + ", venue=" + venue + ", teams=" + teams + ",  date="
				+ date + "]";
	}
	
	
	
	
}
