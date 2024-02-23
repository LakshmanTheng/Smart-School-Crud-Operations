package com.numetry.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SchoolEntity")
public class SchoolEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//automatically generated id as prymary key
	private Long id;
	private String Employmentstatus;
	private String staffype;
	private String staffDepartment;
	private String EmploymentCategory;
	private String designation;
	private String firstname;
	private String middlename;
	private String lastname;
	private String mobileno;
	private String emergencyno;
	private String email;
	private String adharno;
	private String panno;
	private String govid;
	private String gender;
	private Date dob;
	private Date doj;
	private String citizenship;
	private String salarytype;
	private String staffreferancecode;
	private String peraddress;
	private String curruntaddress;
	
	public SchoolEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public SchoolEntity(String employmentstatus, String staffype, String staffDepartment, String employmentCategory,
			String designation, String firstname, String middlename, String lastname, String mobileno,
			String emergencyno, String email, String adharno, String panno, String govid, String gender, Date dob,
			Date doj, String citizenship, String salarytype, String staffreferancecode, String peraddress,
			String curruntaddress) {
		super();
		Employmentstatus = employmentstatus;
		this.staffype = staffype;
		this.staffDepartment = staffDepartment;
		EmploymentCategory = employmentCategory;
		this.designation = designation;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.emergencyno = emergencyno;
		this.email = email;
		this.adharno = adharno;
		this.panno = panno;
		this.govid = govid;
		this.gender = gender;
		this.dob = dob;
		this.doj = doj;
		this.citizenship = citizenship;
		this.salarytype = salarytype;
		this.staffreferancecode = staffreferancecode;
		this.peraddress = peraddress;
		this.curruntaddress = curruntaddress;
	}



	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	public String getEmploymentstatus() {
		return Employmentstatus;
	}

	
	public void setEmploymentstatus(String employmentstatus) {
		Employmentstatus = employmentstatus;
	}

	
	public String getStaffype() {
		return staffype;
	}

	
	public void setStaffype(String staffype) {
		this.staffype = staffype;
	}

	
	public String getStaffDepartment() {
		return staffDepartment;
	}

	
	public void setStaffDepartment(String staffDepartment) {
		this.staffDepartment = staffDepartment;
	}

	
	public String getEmploymentCategory() {
		return EmploymentCategory;
	}

	
	public void setEmploymentCategory(String employmentCategory) {
		EmploymentCategory = employmentCategory;
	}

	
	public String getDesignation() {
		return designation;
	}

	
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	public String getFirstname() {
		return firstname;
	}

	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	
	public String getMiddlename() {
		return middlename;
	}

	
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	
	public String getLastname() {
		return lastname;
	}

	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	public String getMobileno() {
		return mobileno;
	}

	
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	/**
	 * @return the emergencyno
	 */
	public String getEmergencyno() {
		return emergencyno;
	}

	public void setEmergencyno(String emergencyno) {
		this.emergencyno = emergencyno;
	}

	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	public String getPanno() {
		return panno;
	}

	
	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getGovid() {
		return govid;
	}

	public void setGovid(String govid) {
		this.govid = govid;
	}

	public String getGender() {
		return gender;
	}

	
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public Date getDob() {
		return dob;
	}

	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getCitizenship() {
		return citizenship;
	}

	
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	public String getSalarytype() {
		return salarytype;
	}

	public void setSalarytype(String salarytype) {
		this.salarytype = salarytype;
	}

	public String getStaffreferancecode() {
		return staffreferancecode;
	}

	public void setStaffreferancecode(String staffreferancecode) {
		this.staffreferancecode = staffreferancecode;
	}

	public String getPeraddress() {
		return peraddress;
	}

	public void setPeraddress(String peraddress) {
		this.peraddress = peraddress;
	}

	public String getCurruntaddress() {
		return curruntaddress;
	}

	public void setCurruntaddress(String curruntaddress) {
		this.curruntaddress = curruntaddress;
	}

	@Override
	public String toString() {
		return "SchoolEntity [id=" + id + ", Employmentstatus=" + Employmentstatus + ", staffype=" + staffype
				+ ", staffDepartment=" + staffDepartment + ", EmploymentCategory=" + EmploymentCategory
				+ ", designation=" + designation + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", mobileno=" + mobileno + ", emergencyno=" + emergencyno + ", email="
				+ email + ", adharno=" + adharno + ", panno=" + panno + ", govid=" + govid + ", gender=" + gender
				+ ", dob=" + dob + ", doj=" + doj + ", citizenship=" + citizenship + ", salarytype=" + salarytype
				+ ", staffreferancecode=" + staffreferancecode + ", peraddress=" + peraddress + ", curruntaddress="
				+ curruntaddress + "]";
	}
	
}
