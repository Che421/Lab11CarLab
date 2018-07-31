package com.car;

import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userChoice2 = null;
		String userChoice3 = null;
		int num = 0;

		ArrayList<CarClass> carLot = new ArrayList<>();
		CarClass c1 = new CarClass("Nikolai", "Model S", 2017, 54999.90);
		CarClass c2 = new CarClass("Fourd", "Escapade", 2017, 31999.90);
		CarClass c3 = new CarClass("Chewie", "Vette", 2017, 44989.95);

		CarClass c4 = new UsedCar("Hyonda", "Prior", 2015, 14795.50, 35987.60);
		CarClass c5 = new UsedCar("GC", "Chirpus", 2013, 15999.50, 25676.90);
		CarClass c6 = new UsedCar("GC", "Witherell", 2016, 14500, 3500.00);

		carLot.add(c1);
		carLot.add(c2);
		carLot.add(c3);
		carLot.add(c4);
		carLot.add(c5);
		carLot.add(c6);

		do {
			num = 0;
			for (CarClass c : carLot) {
				System.out.print(++num + ". ");
				System.out.println(c);

			}

			System.out.println("Which car would you like? ");
			int userChoice = scan.nextInt();
			System.out.println(carLot.get(userChoice - 1));
			System.out.println("Would you like to buy this car? yes or no");
			scan.nextLine();
			userChoice2 = scan.nextLine();
			if (userChoice2.equalsIgnoreCase("Yes")) {
				System.out.println("Excellent our finance department will be in touch shortly.");
				carLot.remove(userChoice);
			}
			System.out.println("Do you like another car? yes or no");
			userChoice3 = scan.next();
		} while (userChoice3.equalsIgnoreCase("Yes"));
		System.out.println("Have a great Day!");
	}
}
