package org.psdr3.eresponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





public class EResponseDBService {

	private static int eventNumber = 1;
	
	//FIX THE CONNECTION STRING SOON IT IS NOT RIGHT
	private static final String CONNECTION_STRING = "jdbc:postgresql://localhost:5432/check_ins";
	private static final Logger LOGGER = LoggerFactory.getLogger(EResponseDBService.class);
	
	
	
//	public static Student createCheckin(int event_id, String student_id) {
//		//checking means putting in current event id, the student id, and the time 
//		try(Connection connection = DriverManager.getConnection(CONNECTION_STRING)){ 
//			
//			String create = "INSET INTO check_ins (event_id, student_id) " + "VALUES (?,?)";
//			 
//			PreparedStatement statement = connection.prepareStatement(create);  
//			statement.setInt(1,student.getEvent_id());
//			statement.setString(2,student.getStudent_id());
//
//			statement.executeUpdate();
//			connection.close();
//			return student;
//
//			
//			
//		}catch(SQLException e) {
//			LOGGER.debug(e.getMessage());
//			return null;
//		}
//		
//	}
}
