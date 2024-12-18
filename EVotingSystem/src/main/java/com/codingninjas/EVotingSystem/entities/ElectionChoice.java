package com.codingninjas.EVotingSystem.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="electionchoice")
public class ElectionChoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	private String name;
	
	@ManyToOne
	@JoinColumn(name="election_id")
//	@JsonBackReference
	private Election election;
	
	 private Long voteCount; 

	public ElectionChoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectionChoice(Long id, String name, Election election) {
		super();
		this.id = id;
		this.name = name;
		this.election = election;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Election getElection() {
		return election;
	}

	public void setElection(Election election) {
		this.election = election;
	}

	public Long getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(Long voteCount) {
		this.voteCount = voteCount;
	}
	
	
	

}
