package com.prasanna.employee.salary;

public class Employee {
	
	private int empId;
	private String name;
	static int grossSalary=10000;
	private int salary;
	private int workHours;
	static int maxHours=100;
	
	public Employee(int empId, String name, int workHours) {
		super();
		this.empId = empId;
		this.name = name;
		this.workHours = workHours;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

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

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", workHours=" + workHours + "]";
	}
	
	
	
	
	
	
}
