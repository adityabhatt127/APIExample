package com.example.FirstExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user1")
public class User1 {
	
	@Id
	@Column(name = "mailid")
	String mailid;
	
	@Column(name = "fname")
	String fname;
	
	@Column(name = "lname")
	String lname;
	
	public User1()
	{
		
	}
	
	public User1(String mailid, String fname, String lname) {
		super();
		this.mailid = mailid;
		this.fname = fname;
		this.lname = lname;
	}

	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
}
