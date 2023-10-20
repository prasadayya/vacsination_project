package com.project.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.vaccination.model.UserDetail;

public interface Userrepo extends JpaRepository<UserDetail, Integer> {
    
}