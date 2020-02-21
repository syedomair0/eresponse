package org.psdr3.eresponse;

public class Student {
	private int event_id;
	private String student_id;

	//student id (Character/String)
	//event id (Integer)
	//time_in (time with time zone)
	
	public Student(int event_id, String student_id) {
		super();
		this.event_id = event_id;
		this.student_id = student_id;

	}

	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public String getStudent_id() {
		return student_id;
	} 

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	
	public Student() {
		super();
	}
	
	
}
