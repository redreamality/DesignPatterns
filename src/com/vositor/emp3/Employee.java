package com.vositor.emp3;

public abstract class Employee {
	public final static int MALE   = 0; //0 代表男性
	public final static int FEMALE = 1; //1 代表女性
	
	private String name; 
	private int salary;
	private int sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	//我允许一个访问者访问
	public abstract void accept(IVisitor visitor); 
	
}
