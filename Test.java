package com.prasanna.employee.salary;

import java.util.LinkedList;
import java.util.List;

public class Test {
	
	static List<Employee> list = new LinkedList<>();
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee(1,"A",80);
		Employee e2 = new Employee(2,"B",100);
		Employee e3 = new Employee(3,"c",70);
		Employee e4 = new Employee(2,"D",90);
		Employee e5 = new Employee(2,"E",50);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		calculateSalary.start();
		printDetails.start();
		
		
	}
	
	static Thread calculateSalary = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(Employee emp:list) {
				System.out.println("calculating....");
				emp.setSalary(Employee.grossSalary*emp.getWorkHours()/Employee.maxHours);
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	});
	
	static Thread printDetails = new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			for(Employee emp:list) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(emp);
			}
			
		}
	});
}

