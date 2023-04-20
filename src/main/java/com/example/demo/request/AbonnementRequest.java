package com.example.demo.request;

import java.util.Date;

import com.example.demo.entity.Packe;
import com.example.demo.entity.UserEntity;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class AbonnementRequest {
	@Temporal(TemporalType.DATE)
	private Date date;
	private UserEntity client;
	private Packe packe;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public UserEntity getClient() {
		return client;
	}
	public void setClient(UserEntity client) {
		this.client = client;
	}
	public Packe getPacke() {
		return packe;
	}
	public void setPacke(Packe packe) {
		this.packe = packe;
	}
	
}
