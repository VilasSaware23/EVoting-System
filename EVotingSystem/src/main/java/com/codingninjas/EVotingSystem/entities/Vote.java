package com.codingninjas.EVotingSystem.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="vote")
public class Vote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	@OneToOne
//    @JsonManagedReference
	private User user;
	
	@ManyToOne
	@JoinColumn(name="election_id")
//	@JsonBackReference
	private Election election;
	
	@ManyToOne
	@JoinColumn(name="electionchoice_id")
//	@JsonBackReference
	private ElectionChoice electionChoice;

	public Vote(long id, User user, Election election, ElectionChoice electionchoice) {
		super();
		this.id = id;
		this.user = user;
		this.election = election;
		this.electionChoice = electionchoice;
	}

	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Election getElection() {
		return election;
	}

	public void setElection(Election election) {
		this.election = election;
	}


	public ElectionChoice getElectionChoice() {
		return electionChoice;
	}

	public void setElectionChoice(ElectionChoice electionChoice) {
		this.electionChoice = electionChoice;
	}
}
