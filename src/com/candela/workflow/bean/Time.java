package com.candela.workflow.bean;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second="
				+ second + "]";
	}
	
	
	

}