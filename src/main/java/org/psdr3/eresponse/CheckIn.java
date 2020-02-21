package org.psdr3.eresponse;

import java.util.Date;

public class CheckIn {

	private int eventId;
	private String studentId;
	private Date date;
	
	public CheckIn() {
		
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	@Override
	public String toString() {
		return "CheckIn [eventId=" + eventId + ", studentId=" + studentId + ", date=" + date + "]";
	}
	
	
	
}
