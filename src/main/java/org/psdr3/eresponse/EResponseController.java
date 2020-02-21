package org.psdr3.eresponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* This is similar to the videos but with GetMapping(events)
 * 									      PostMapping(events)	
 * 										  PostMapping(events)/{event-id}/{student-id}
 */




@RestController

public class EResponseController {
	
	@GetMapping("/student")
	public Student student() {
		return new Student(1,"12345");
	}
	
	
	
	
	
//	@PostMapping(value="/events/{event_id}/{student_id",consumes="application/json")
//	
//	public Student createCheckin(@RequestBody  int event_id, String student_id) {
//		return EResponseDBService.createCheckin(event_id,student_id);
//	}
	
	
	
	
	
	
	


	

	
	
	
}
