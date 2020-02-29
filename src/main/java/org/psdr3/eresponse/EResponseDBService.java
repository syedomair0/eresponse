package org.psdr3.eresponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





public class EResponseDBService {

	private static int eventNumber = 1;
	
	private static final String CONNECTION_STRING = "jdbc:postgresql://localhost:5432/e_response";
	private static final Logger LOGGER = LoggerFactory.getLogger(EResponseDBService.class);
	
	
	
	public static boolean createCheckin(int event_id, String student_id) {

		try(Connection connection = DriverManager.getConnection(CONNECTION_STRING, "postgres", "2LearnLinux!" )){ 
			
			String create = "INSERT INTO check_ins (event_id, student_id) " + "VALUES (?,?)";
			 
			PreparedStatement statement = connection.prepareStatement(create);  
			statement.setInt(1, event_id);
			statement.setString(2, student_id);

			int updates = statement.executeUpdate();
			connection.close();
			return updates == 1;
			

			
			
		}catch(SQLException e) {
			LOGGER.debug(e.getMessage());
			return false;
		}
	}
}
