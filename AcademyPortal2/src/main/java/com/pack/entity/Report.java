package com.pack.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REPORT")
public class Report {

	@Id
	private String batchid;
	private int weeklyproject;
	private int bhs;
	private int mock;
	private int innovation;
	
	
	public void setMock(int mock) {
		this.mock = mock;
	}
	public void setInnovation(int innovation) {
		this.innovation = innovation;
	}
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	
	
	
	public int getBhs() {
		return bhs;
	}
	public void setBhs(int bhs) {
		this.bhs = bhs;
	}
	public int getMock() {
		return mock;
	}
	public int getInnovation() {
		return innovation;
	}
	public int getWeeklyproject() {
		return weeklyproject;
	}
	public void setWeeklyproject(int weeklyproject) {
		this.weeklyproject = weeklyproject;
	}
	
	
	
}
