
import java.util.List;

public interface EmployeeDao {
	
	
	public List<Employee> getAllEmployeeDetails();
	public void insertEmployee();
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int empId);


}
