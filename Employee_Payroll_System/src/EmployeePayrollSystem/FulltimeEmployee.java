package EmployeePayrollSystem;

public class FulltimeEmployee extends Employee {
	private double monthlySalary;

	public FulltimeEmployee(int id, String name, double monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	@Override
	public double calculateSalary() {

		return monthlySalary;
	}

}
