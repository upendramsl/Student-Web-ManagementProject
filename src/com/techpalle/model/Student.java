package com.techpalle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Id;

@Entity  //For Creating the table
@Table(name="Student")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)           //for getting autoincrement which is also primarykey
    @Column(name="id") 
	private int Id;
	@Column(name="Name")
	private String Name;
	@Column(unique = true)
	private String Email;
	private long mobile;
	//@Column(name="Password")
	private String Pass;
	public Student() {
		super();
	}
	public Student(String name, String email, long mobile, String pass) {
		
		this.Name = name;
		this.Email = email;
		this.mobile = mobile;
		this.Pass = pass;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
		

}
