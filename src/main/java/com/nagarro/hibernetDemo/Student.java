package com.nagarro.hibernetDemo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="student_table")
public class Student {
    @Id
	private int id;
   // @Column(name="studentName")  // for giving specific name to clumn
 
   // @Transient  //when we dont want a perticular column in our table
	//private String name;
    
    private StudentName name;
	
    private String city;
	public Student() {
		super();
	}
	public Student(int id,StudentName name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudentName getName() {
		return name;
	}

	public void setName(StudentName name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
