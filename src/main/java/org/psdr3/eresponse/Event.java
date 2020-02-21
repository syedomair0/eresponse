package org.psdr3.eresponse;

import java.util.Date;

public class Event {
	private int eventId;
	private String title;
	private Date date;
	
	public Event() {
		
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", title=" + title + ", date=" + date + "]";
	}
	
	
	
}
