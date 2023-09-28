package com.nagarro.hibernetDemo;

import javax.persistence.Embeddable;

@Embeddable   //this means it can be emedded in another table if we make it @Entity it will create new table
public class StudentName {
    String fname;
    String lname;
    String mname;
   
    
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
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	 @Override
		public String toString() {
			return "StudentName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
		}
	
}
