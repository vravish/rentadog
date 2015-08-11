CREATE DATABASE Doggie; 
USE Doggie;

CREATE TABLE InputQueue(
	id INT NOT NULL AUTO_INCREMENT,
	dog_type INT NOT NULL,
	start_time INT NOT NULL,
	end_time INT NOT NULL,
	location INT NOT NULL, 
	user_age INT NOT NULL,
	user_phone_number INT NOT NULL,
	date_rating INT NOT NULL,
	dog_age INT NOT NULL,
	dog_name VARCHAR(1024),
	username VARCHAR(1024),
	email VARCHAR(128),
	PRIMARY KEY(id)
);

CREATE TABLE Results(
	experimentID INT NOT NULL,
	parameters VARCHAR(128),
	results VARCHAR(128),
	done BOOL,
	FOREIGN KEY(experimentID) REFERENCES InputQueue(id)
);
