package com.java.example.model;

import java.util.Arrays;
import java.util.List;

public class Reading {
 int year;
 int month;
 int day;
 public double value;
public Reading(int year, int month, int day, double value) {
	super();
	this.year = year;
	this.month = month;
	this.day = day;
	this.value = value;
}
 
 public static List<Reading> getReadingList(){
	 
	return Arrays.asList(new Reading(2017,1,1,405.51),
				new Reading(2017,1,8,405.91),new Reading(2017,1,15,406.14),
				new Reading(2017,1,22,406.48),new Reading(2017,1,29,406.20),
				new Reading(2017,1,5,407.21),new Reading(2017,1,12,406.03));
 }
 
 
}
