package com.example.demo;

public class studentclass {
	private int rollno;
	private String name;
	private int rank;
	public studentclass(int rollno, String name, int rank) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.rank = rank;
	}
	public studentclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
