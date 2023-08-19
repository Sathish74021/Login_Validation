package ServletDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Employe_Details")
public class EmployeDto {
	private int Emp_Id;
	private String Emp_Name;
	@Id
	private String Emp_Email;
	private String Emp_Password;
	private String Emp_ConfirmPassword;
	private String Emp_DOB;
	private String Emp_Country;
	private String Gender;

	public int getEmp_Id() {
		return Emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public String getEmp_Email() {
		return Emp_Email;
	}

	public void setEmp_Email(String emp_Email) {
		Emp_Email = emp_Email;
	}

	public String getEmp_Password() {
		return Emp_Password;
	}

	public void setEmp_Password(String emp_Password) {
		Emp_Password = emp_Password;
	}

	public String getEmp_ConfirmPassword() {
		return Emp_ConfirmPassword;
	}

	public void setEmp_ConfirmPassword(String emp_ConfirmPassword) {
		Emp_ConfirmPassword = emp_ConfirmPassword;
	}

	public String getEmp_DOB() {
		return Emp_DOB;
	}

	public void setEmp_DOB(String emp_DOB) {
		Emp_DOB = emp_DOB;
	}

	public String getEmp_Country() {
		return Emp_Country;
	}

	public void setEmp_Country(String emp_Country) {
		Emp_Country = emp_Country;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "EmployeDto [Emp_Id=" + Emp_Id + ", Emp_Name=" + Emp_Name + ", Emp_Email=" + Emp_Email
				+ ", Emp_Password=" + Emp_Password + ", Emp_ConfirmPassword=" + Emp_ConfirmPassword + ", Emp_DOB="
				+ Emp_DOB + ", Emp_Country=" + Emp_Country + ", Gender=" + Gender + "]";
	}

}
