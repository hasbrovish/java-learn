package demo.objectClass;

import java.util.Objects;

public class Employee {

	private int empNo;
	private String empName;
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empName, empNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empName, other.empName) && empNo == other.empNo;
	}
	
	//Manual Oveeride of hashcode() and equals()
/*
	public int hashCode() {
		return empNo;
	}
	
//	@Override --> giving error as method signature is not matching hence
	public boolean equals(Employee obj) {
		if(empNo == obj.empNo) {
			if(empName == obj.empName) {
				return true;
			}
		}
		return false;
	}
*/
	
	
}
