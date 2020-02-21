package org.psdr3.eresponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class EresponseApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EresponseApplication.class, args);
	

	}

}

