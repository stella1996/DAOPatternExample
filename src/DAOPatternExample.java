
public class DAOPatternExample {

	public static void main(String[] args) {
		
		
		EmployeeDao employeeDao= new EmployeeDaoImplementation();
		
		
		System.out.println("Before Insertion:"+" "+employeeDao.getAllEmployeeDetails());
		employeeDao.insertEmployee();
		System.out.println("After Insertion:"+" "+employeeDao.getAllEmployeeDetails());
		Employee employee= employeeDao.getAllEmployeeDetails().get(1);
		employee.setEmpName("srilatha");
		employeeDao.updateEmployee(employee);
		System.out.println("After Updation:"+" "+employeeDao.getAllEmployeeDetails());
		employeeDao.deleteEmployee(0);
		System.out.println("After Deletion:"+" "+employeeDao.getAllEmployeeDetails());


		
	}

}
