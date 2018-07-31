package com.car;

public class UsedCar extends CarClass {
	public UsedCar(String make, String model, int year, double price) {
        super(make, model, year, price);
        
    }
	
	private double mileage;
	
	public UsedCar(String make, String model, int year, double price, double miles) {
		super(make, model, year, price);
		mileage = miles;
	}
	
	public double getMileage(double mileage)  {
		return mileage;
	}
	
	public double setMileage(double mileage)  {
		return mileage;
	}

	@Override
	public String toString() {
		return super.toString() + "(Used)" + " " + mileage + " miles";
	}
	
	
}
