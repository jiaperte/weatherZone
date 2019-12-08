DROP TABLE IF EXISTS weather;
CREATE TABLE weather (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  locationType VARCHAR(250),
  locationCode INT,
  locationName VARCHAR(250),
  windDirection VARCHAR(250),
  windSpeed VARCHAR(250),
  temperature VARCHAR(250),
  cloudPercent VARCHAR(250),
  humidity VARCHAR(250),
  icon VARCHAR(250),
  precipiPercent VARCHAR(250),
  pressure VARCHAR(250),
  dateTime DATE(0),  
);