package EmployeePayrollSystem;

public class MainSystem {
	public static void main(String[] args) { 
		PayrollSystem payrollsystem=new PayrollSystem();
		FulltimeEmployee emp1= new FulltimeEmployee(1, "Shree", 12000.0);
		PartTimeEmployee emp2=new PartTimeEmployee(2, "Pant", 54, 100);
		
		payrollsystem.addEmployee(emp1);
		payrollsystem.addEmployee(emp2);
		
		System.out.println("Initial Employee Details: ");
		payrollsystem.displayEmployee();
		
		System.out.println("To Remove Employee: ");
		payrollsystem.removeEmployee(1);
		
		System.out.println("Remains Employee Details: ");
		payrollsystem.displayEmployee();
	}

}
