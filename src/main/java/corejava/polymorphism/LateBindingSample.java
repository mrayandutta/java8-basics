package corejava.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class LateBindingSample {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new PermanentEmployee());
		employeeList.add(new ContractualEmployee());
		
		for(Employee employee:employeeList)
		{
			employee.processSalary();
		}
	}

}
