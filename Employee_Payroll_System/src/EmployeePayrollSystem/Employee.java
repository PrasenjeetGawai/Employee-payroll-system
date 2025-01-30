package EmployeePayrollSystem;

public abstract class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public abstract double calculateSalary();

	@Override
	public String toString() {
		return "Employee [Name ->" + name + " Id ->" + id + " Salary ->" + calculateSalary() + "]";
	}

}
