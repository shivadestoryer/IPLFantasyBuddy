package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Users {
	
	@Id
	private int uid;
	private String name;
	private String email;
	private String codeName;
	
	//@OneToMany(mappedBy="user")
	 @OneToMany(mappedBy = "user", targetEntity = Comment.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("comment")
	private List<Comment> comment;
	
	public int getUid() {
		return uid;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", name=" + name + ", email=" + email + ", codeName=" + codeName + "]";
	}
	
	
	
	
	
	

}
