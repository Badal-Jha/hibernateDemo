package com.nagarro.hibernetDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {
	@Id
	private int id;
	// @Column(name="studentName") // for giving specific name to clumn

	// @Transient //when we dont want a perticular column in our table
	// private String name;

	private StudentName name;

	private String city;
	// mappedBy="student" will not create the foreign_key student_id in Student it
	// will nonly
	// create foreign key in child Laptop
	// cascade = CascadeType.ALL it means any change in parent should also reflect
	// to child
	@OneToOne(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Laptop laptop;
	// Here by default fetch=FetchType.LAZY that means it only load sim table when
	// we access any sim data
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Sim> sim = new ArrayList<>();

	public Student() {
		super();
	}

	public Student(int id, StudentName name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public List<Sim> getSim() {
		return sim;
	}

	public void setSim(List<Sim> sim) {
		this.sim = sim;
	}

}
