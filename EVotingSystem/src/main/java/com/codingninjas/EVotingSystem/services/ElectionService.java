package com.codingninjas.EVotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.repositories.ElectionRepository;

@Service
public class ElectionService {
	
	@Autowired
	ElectionRepository electionrepository;

	public List<Election> getAllElections() {
		// TODO Auto-generated method stub
		return electionrepository.findAll();
	}

	public void addElection(Election election) {
		// TODO Auto-generated method stub
		 electionrepository.save(election);
	}


}
