package com.playbox.playboxapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Toy {
	@Id
	@Column(name = "toyId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long toyId;
	
	

}
