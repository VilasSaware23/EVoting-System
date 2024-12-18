package com.codingninjas.EVotingSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingninjas.EVotingSystem.entities.Election;

public interface ElectionRepository extends JpaRepository<Election, Long> {


	
	

}
