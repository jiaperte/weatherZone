# Weather Data Web Application
Create a simple web app using both React and Spring Boot which displays a table of
weather data. The weather data will be consumed from the Spring Boot API and the data displayed
using React. The weather data will be provided to you in a CSV file.
This is not a design task, or meant to be a complete functional application. UI elements and patterns
should be appropriate for the purpose, but no special design effort needs to be put in.

API Details
Your Spring Boot application should be your API for which you query weather data from. You can create
your own in memory database using the CSV provided, or directly get data from the CSV. API security is
not required.

UI Requirements
The app should perform the search with query and display the weather data in a table format. The
format is up to you, but should include at a minimum:

● A dropdown containing the locations to be displayed. The locations are available in the CSV

● The table should contain the following weather data: precipitation probability (chance),
temperature, wind speed and wind direction.

● The date and time should be shown. Think about how dates and times should be displayed,
including time zones.

Data
You will be provided a CSV containing (old) forecast data for the following 8 locations: Adelaide,
Brisbane, Canberra, Darwin, Hobart, Melbourne, Perth and Sydney.

## Dependencies

* JDK 8
* Maven
* Springboot

## How to start this project

### Clone the repository

git clone https://github.com/daiqinge/weatherZone

Install JDK, Maven

Application.java-->Run

Browser visit url: http://localhost:8090/



