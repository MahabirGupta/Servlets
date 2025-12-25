package com.mahabir.todo;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Todo {
	private int id;
	private String user; 
//	Add validation for description
	@Size(min=6,message="Enter at least 6 characters")
	private String desc;
//	Add validation for target date
	@Future(message = "Target date must be in the future")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date targetDate;
	private boolean isDone;
	
//	Create default constructor
	public Todo() {
		
	}
	public Todo(int id, String user, String desc, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public String toString() {
		return String.format("ToString - Todo [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id, user, desc, targetDate,
				isDone);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}
	
	
	
	
	

}
