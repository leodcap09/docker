package com.hellokoding.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Players {
      @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String player;

    private String club;

public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}


}
