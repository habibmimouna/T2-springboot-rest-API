package net.javaguides.springboot.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name="employees")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name = "first_name", nullable = false)
private String firstName;
@Column(name = "last_name")
private String lastName;
@Column(name = "email")
private String email;
public Object getFirstName() {
	// TODO Auto-generated method stub
	return null;
}
public void setFirstName(Object firstName2) {
	// TODO Auto-generated method stub
	
}
public Object getLastName() {
	// TODO Auto-generated method stub
	return null;
}
public void setLastName(Object lastName2) {
	// TODO Auto-generated method stub
	
}
public Object getEmail() {
	// TODO Auto-generated method stub
	return null;
}
public void setEmail(Object email2) {
	// TODO Auto-generated method stub
	
}
}
