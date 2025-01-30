package EmployeePayrollSystem;

import java.util.ArrayList;

public class PayrollSystem {
	
	private ArrayList<Employee> employeeList;
	
	public PayrollSystem() {
		employeeList=new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	public void removeEmployee(int id) {
		Employee employeeToRemove = null;
		for(Employee emp : employeeList) {
			if(emp.getId()==id) {
				employeeToRemove=emp;
				break;
			}
		}
		if(employeeToRemove !=  null) {
			employeeList.remove(employeeToRemove);
		}
		
	}
	public void displayEmployee() {
		for(Employee emp: employeeList) {
			System.out.println(emp);
		}
	}

}
