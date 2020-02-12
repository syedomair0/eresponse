package org.psdr3.eresponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import classrestservice.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class EresponseApplication {
	public static final Logger LOGGER
	= LoggerFactory.getLogger();

public static final String CONNECTION_STRING
= "";

	public static void main(String[] args) {
		SpringApplication.run(EresponseApplication.class, args);
		
			
			try(Connection connection = 
					DriverManager.getConnection(CONNECTION_STRING)){
				String insert = "INSERT INTO checkinStudents (studentId, checkinTime " 
						+ "VALUES (?, ?)";
				PreparedStatement statement = connection.prepareStatement(insert);
				statement.setString( );
				statement.setString( );
				
				
				statement.executeUpdate();
				connection.close(); 

				
			} catch (SQLException e) {
				LOGGER.debug(e.getMessage());
				return null;
			}
		
		
		
	
	}

}
