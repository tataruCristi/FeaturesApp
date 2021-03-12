package com.tataru.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5214203427047496236L;
	
	
	@ManyToOne
	private User user;
	@ManyToOne
	private Feature feature;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Feature getFeature() {
		return feature;
	}
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	
}
