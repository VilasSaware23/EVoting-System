package com.codingninjas.EVotingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.services.VoteService;

@RestController
public class VoteController<vote> {
	
	@Autowired
	VoteService voteservice;;
	
	
	@GetMapping("/get/votes")
	public List<Vote> getAllvotes(){
		return voteservice.getAllVotes();
	}
	
	@PostMapping("/add/vote")
	public void addVote(@RequestBody Vote vote) {
		voteservice.addVote(vote);
	}
	
	@GetMapping("/count/votes")
    public ResponseEntity<Long> getVoteCount() {
        long voteCount = voteservice.getTotalVotes();
        return ResponseEntity.ok(voteCount);
    }
	
	@PostMapping("/count/election/votes")
    public ResponseEntity<Long> getVotesByElection(@RequestBody Election election) {
        long voteCount = voteservice.getVotesByElection(election);
        return ResponseEntity.ok(voteCount);
    }

}
