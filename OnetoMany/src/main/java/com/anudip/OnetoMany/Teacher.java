package com.anudip.OnetoMany;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Teacher {
	@Id
	private int  id;
	private String name;
	@OneToMany
	List<Subject> list1=new ArrayList<Subject>();
	public List<Subject> getList1() {
		return list1;
	}
	public void setList1(List<Subject> list1) {
		this.list1 = list1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}