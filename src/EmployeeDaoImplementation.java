import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImplementation implements EmployeeDao {

	List<Employee> employeesDetails;
	public EmployeeDaoImplementation() {
		employeesDetails = new ArrayList();
		Employee emp= new Employee(1,"Stella","finance",30000,8768594032L,"chennai");
		Employee emp1= new Employee(2,"Steffy","Admin",60000,1234567890L,"Mumbai");
		employeesDetails.add(emp);
		employeesDetails.add(emp1);
	} 
	

	@Override
	public List<Employee> getAllEmployeeDetails() {
		return employeesDetails;
	}

	@Override
	public void insertEmployee() {
		
		Employee emp= new Employee(3,"Maria","HealthCare",20000,2345678901L,"Kerala");
		Employee emp1= new Employee(4,"Krishna","Admin",80000,1256437890L,"Singapore");
		employeesDetails.add(emp);
		employeesDetails.add(emp1);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		
		employeesDetails.get(employee.getEmpId()).setEmpName(employee.getEmpName());
		
	}

	@Override
	public void deleteEmployee(int index) {
		employeesDetails.remove(index);
		
	}

}
