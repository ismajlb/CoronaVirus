package com.hamburg.CoronaVirus.modules;

public class LocationStats {
	
	private String state;
	private String country;
	private int latestTotalCases;
	private int dayYesteday;
	private int newCases;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	public int getDayYesteday() {
		return dayYesteday;
	}
	public void setDayYesteday(int dayYesteday) {
		this.dayYesteday = dayYesteday;
	}
	public int getNewCases() {
		return newCases;
	}
	public void setNewCases(int newCases) {
		this.newCases = newCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ ", dayYesteday=" + dayYesteday + ", newCases=" + newCases + "]";
	}
	


	
	
	
	

}
