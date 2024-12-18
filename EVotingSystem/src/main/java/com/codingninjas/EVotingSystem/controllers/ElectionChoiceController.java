package com.codingninjas.EVotingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.services.ElectionchoiceService;

@RestController
public class ElectionChoiceController {
	
	@Autowired
	ElectionchoiceService electionchoiceservice;
	
	@PostMapping("/add/electionChoice")
	public void addElectionChoice(@RequestBody ElectionChoice electionchoice) {
		electionchoiceservice.addElectionChoice(electionchoice);
		
	}
	
	@GetMapping("/get/electionChoices")
	public List<ElectionChoice> getAllElectionChoicelist(){
		return electionchoiceservice.getAllElectionChoicelist();
	}
	
	@PostMapping("/count/election/choices")
	public long countElectionChoice(@RequestBody Election election){
		return electionchoiceservice.countElectionChoice(election);
	}
	
	 @PostMapping("/winner/election")
	    public ResponseEntity<ElectionChoice> getElectionWinner(@RequestBody Election election) {
	        ElectionChoice winner = electionchoiceservice.getElectionWinner(election);
	        return ResponseEntity.ok(winner);
	    }

}
