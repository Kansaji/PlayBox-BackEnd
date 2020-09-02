package com.playbox.playboxapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Gear {
	@Id
	@Column(name = "gearId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long gearId;
}
