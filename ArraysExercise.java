package com.bae.arrays;

public class ArraysExercise {

	public static void main(String[] args) {

		int value = 1;
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
			value++;
			System.out.println(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 10;
			System.out.println(arr[i]);
		}
	}
}
