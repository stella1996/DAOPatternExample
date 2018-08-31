
public class Employee {
	
	private int empId;
	private String empName;
	private String empDept;
	private int empSalary;
	private Long empMobileNumber;
	private String empAddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() { 
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public Long getEmpMobileNumber() {
		return empMobileNumber;
	}
	public void setEmpMobileNumber(Long empMobileNumber) {
		this.empMobileNumber = empMobileNumber;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public Employee(int empId, String empName, String empDept, int empSalary, Long empMobileNumber,
			String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
		this.empMobileNumber = empMobileNumber;
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary=" + empSalary
				+ ", empMobileNumber=" + empMobileNumber + ", empAddress=" + empAddress + "]";
	}
	
	

}
