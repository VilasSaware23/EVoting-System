package com.codingninjas.EVotingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.repositories.VoteRepository;


@Service
public class VoteService {
	
	@Autowired
	VoteRepository voterepository;

	public List<Vote> getAllVotes() {
		return voterepository.findAll();
	}

	public void addVote(Vote vote) {
		voterepository.save(vote);
		
	}

	public long getTotalVotes() {
		return voterepository.count();
	}

	public long getVotesByElection(Election election) {
		return voterepository.countVotesByElection(election);
	}

}
