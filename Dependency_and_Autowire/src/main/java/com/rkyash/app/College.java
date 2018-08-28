package com.rkyash.app;

import org.springframework.stereotype.Component;

@Component()  // Name of class is college by default
//@Component("col")  //  name of class is col 
public class College {
	private int cId;
	private String cName;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	@Override
	public String toString() {
		return "College [cId=" + cId + ", cName=" + cName + "]";
	}
	
	public void search()
	{
		System.out.println("Searching..");
	}
	

}
