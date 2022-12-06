package com.test.hibernate6discriminatorbug.demo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
 
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.MERGE, CascadeType.PERSIST }, mappedBy = "entity")
	private Set<UserValueBase> properties = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<UserValueBase> getProperties() {
		return properties;
	}

	public void setProperties(Set<UserValueBase> properties) {
		this.properties = properties;
	}

	
}
