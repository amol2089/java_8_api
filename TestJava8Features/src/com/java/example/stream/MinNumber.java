package com.java.example.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinNumber {

	public static void main(String[] args) {
		int[] numbers = {4,2,13,29,5,46,0};
		OptionalInt minInt= IntStream.of(numbers)
					.min();
//					.ifPresent(System.print::ln);
		if(minInt.isPresent())
		System.out.println(minInt.getAsInt());
	}
}
