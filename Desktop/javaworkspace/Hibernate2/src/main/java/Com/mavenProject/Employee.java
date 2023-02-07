package Com.mavenProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name= "emp")// table created
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//  dissided  database
private int id;
@Column(name = "Fullname") //create column
private String Fullname;
@Column(name = "Address")
private String Address;
//@Column(name = "Salary")
//private long Salary;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullname() {
	return Fullname;
}
public void setFullname(String fullname) {
	Fullname = fullname;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
//public long getSalary() {
//	return Salary;
//}
//public void setSalary(long salary) {
//	Salary = salary;
//}

@Override
public String toString() {
	return "Employee [id=" + id + ", Fullname=" + Fullname + ", Address=" + Address +  "]";
}


	

}
