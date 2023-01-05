CREATE DATABASE IF NOT EXISTS song;

USE song;

CREATE TABLE song (
  id int NOT NULL AUTO_INCREMENT,
  artist varchar(255),
  genre int ,
  link varchar(255),
  song_name varchar(255)
);