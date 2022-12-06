package com.test.hibernate6discriminatorbug.demo.model;

  

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType; 
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@DiscriminatorValue(UserValueBase.UDFID)
public class UserValueBase extends ValueBase {


	public final static String UDFID = "1";

	@ManyToOne(fetch=FetchType.LAZY, cascade = {})
	@JoinColumn(name = "entity_id", nullable = false)
	private User entity;

	public User getEntity() {
		return entity;
	}

	public void setEntity(User entity) {
		this.entity = entity;
	}
}
