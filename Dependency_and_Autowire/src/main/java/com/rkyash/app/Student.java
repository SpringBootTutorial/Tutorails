package com.rkyash.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") // check for scope type value
public class Student {
	
	private int sId;
	private String sName;
	private String tech;
	@Autowired  // AutoWired search by type by default class name
	//@Qualifier("college") // Qualifer search by Name
	private College college;
	
	
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public Student() {
		super();
		System.out.println("object create ones");
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("Hey , How are you");
		college.search();
		
	}

}
