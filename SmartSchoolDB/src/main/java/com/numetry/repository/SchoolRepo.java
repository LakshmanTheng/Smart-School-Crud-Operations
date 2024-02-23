package com.numetry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numetry.entity.SchoolEntity;

public interface SchoolRepo extends JpaRepository<SchoolEntity, Long>{

}
