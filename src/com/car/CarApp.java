package com.car;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		
		CarClass c = new CarClass("Ford", "Taurus", 2005, 5000);
		
		
		ArrayList<CarClass> cars = new ArrayList<>();
		
		System.out.println("How many cars are you entering: ");
		int userNum = scan.nextInt();
		scan.nextLine();
		
		String make;
		String model;
		int year;
		double price;
		
		for (int i = 0; i < userNum; i++) {
			System.out.println("Please enter the make of the car: ");
			make = scan.nextLine();
			System.out.println("Please enter the model of the car: ");
			model = scan.nextLine();
			System.out.println("Please enter the year of the car: ");
			year = scan.nextInt();
			scan.nextLine();
			System.out.println("Please enter the price of the car: ");
			price = scan.nextDouble();
			scan.nextLine();
			
			cars.add(new CarClass(make, model, year, price));
		}
		
		System.out.println("Current Inventory: ");
		for(CarClass list : cars) {
		System.out.println(list);
		}
		
		
		
		
		
		
		
		
	}

}
