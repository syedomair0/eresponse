package org.psdr3.eresponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin


public class EResponseController {

	@PostMapping(value="/events/{event_id}/{student_id}")
	public boolean createCheckin(@PathVariable("event_id") int eventId, @PathVariable("student_id") String studentId) {
		return EResponseDBService.createCheckin(eventId, studentId);
	}
	
}
