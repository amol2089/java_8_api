package com.java.example.mapReduce;

import java.util.List;
import java.util.OptionalDouble;

import com.java.example.model.Reading;

public class Example1 {

	public static void main(String[] args) {
		List<Reading> readings = Reading.getReadingList();
		OptionalDouble avg = readings.stream()
				.mapToDouble(r->r.value)
				.filter(v -> v >=406.0 && v <407.0)
//				.peek(System.out:: print) // prints 406.14  406.48 406.2 406.03
				.average();
		if(avg.isPresent()) 
			System.out.println("Avg of reading 406 readings: "+avg.getAsDouble());
		else
			System.out.println("Emplty is optional!!");
	}
}
