package com.codingninjas.EVotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.repositories.ElectionChoiceRepository;


@Service
public class ElectionchoiceService {
	
	
	@Autowired
	ElectionChoiceRepository electionchoicerepository;

	public void addElectionChoice(ElectionChoice electionchoice) {
		electionchoicerepository.save(electionchoice);
		
		
	}

	public List<ElectionChoice> getAllElectionChoicelist() {
		return electionchoicerepository.findAll();
	}

	public long countElectionChoice(Election election) {
		return electionchoicerepository.countByElection(election);
	}

	public ElectionChoice getElectionWinner(Election election) {
		return electionchoicerepository.findTopByElectionOrderByVoteCountDesc(election);
	}

}
