package com.weatherZone.bean;

public class Weather {
//	private String locationType;
//	private Integer locationCode;
//	private String locationName;
	private String windDirection;
	private String windSpeed;
	private String temperature;
//	private String cloudPercent;
//	private String humidity;
//	private String icon;
	private String precipiPercent;
//	private String pressure;
	private String dateTime;
	
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getPrecipiPercent() {
		return precipiPercent;
	}
	public void setPrecipiPercent(String precipiPercent) {
		this.precipiPercent = precipiPercent;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
