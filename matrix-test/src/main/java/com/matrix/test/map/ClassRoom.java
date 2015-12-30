package com.matrix.test.map;

import java.util.List;

public class ClassRoom {

	private String no;

	private List<Student> stus;

	private double total;

	public ClassRoom() {
		super();
	}

	public ClassRoom(String no) {
		this.no = no;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public List<Student> getStus() {
		return stus;
	}

	public void setStus(List<Student> stus) {
		this.stus = stus;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
