package com.java.example.stream;

import java.util.stream.IntStream;

public class Example2 {
public static void main(String[] args) {
	int[] numbers = {4,2,0,13,29,2,5,46,0};
	int[] numbers1 = {4,2,13,29,5,46};
//	 1.Prints lowest three numbers in asc order
	IntStream.of(numbers)//Creating the stream
	.distinct() //
	.sorted()  //  Processing the stream
	.limit(3)  //
	.forEach(System.out::println);// consuming the streams
	
	System.out.println("======= 2nd Example============ ");
//	2. Prints even number from the string
	IntStream.of(numbers1)
	.filter(num -> num%2 ==1)
	.forEach(System.out::println);
}
}
