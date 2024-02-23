package com.numetry.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.numetry.entity.SchoolEntity;
import com.numetry.repository.SchoolRepo;

@RestController
public class SchoolController {
	
	@Autowired
	SchoolRepo repo;
	
	//localhost:8080/shoolgetAll
	// get all data list
	@GetMapping("/shoolgetAll")
	public List<SchoolEntity> getAllData(){
		List<SchoolEntity> schoolobj= repo.findAll();
		return schoolobj;
		
	}
	//localhost:8080/getone/id
	//get only one data or get data based on id
	@GetMapping("/getoneSchool/{id}")
	public SchoolEntity getschhoolEntity(@PathVariable Long id) {
		SchoolEntity schoolobj=	repo.findById(id).get();
		return schoolobj;
		
	}
	//creating data
	//localhost:8080/postData/add
	@PostMapping("/postData/add")
	public void createSchholdata(@RequestBody SchoolEntity schoolobj) {
		repo.save(schoolobj);
		
	}
	//update data based on id
	@PutMapping("/updateData/{id}")
	public SchoolEntity UpdateSchool(@PathVariable Long id) {
		SchoolEntity schoolobj= repo.findById(id).get();
		schoolobj.setAdharno("9545632112");
		schoolobj.setEmail("ypt@gmail.com");
		schoolobj.setEmploymentCategory("Regular");
		schoolobj.setEmploymentstatus("Continue");
		repo.save(schoolobj);
		return schoolobj;
	}
	//dalete data based on id
	@DeleteMapping("/deleteData/{id}")
	public void deleteData(@PathVariable Long id) {
		SchoolEntity schoolobj=	repo.findById(id).get();
		repo.delete(schoolobj);
		
		
		
	}
	

}
