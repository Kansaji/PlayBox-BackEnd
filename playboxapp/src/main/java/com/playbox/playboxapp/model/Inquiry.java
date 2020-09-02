package com.playbox.playboxapp.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Inquiry {
	@Id
	@Column(name = "inquiryId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long inquiryId;
	@Column(name = "messageContent")
	private String messageContent;
	@Column(name = "createdOn")
	private Instant createdOn;
	
	public long getInquiryId() {
		return inquiryId;
	}
	public void setInquiryId(long inquiryId) {
		this.inquiryId = inquiryId;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public Instant getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Instant createdOn) {
		this.createdOn = createdOn;
	}
	
	

	
}
