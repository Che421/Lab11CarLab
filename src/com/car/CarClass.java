package com.car;

public class CarClass {
	
	private String make;
	private String model;
	private int year;
	private double price;
	public CarClass(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
//	public double setData()  {
//	
//	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		 return String.format("Make: %-20s Model:  %-20s Year:  %-20s Price:  $%-20s\n", make, model, year, price);
	
	
}
}
