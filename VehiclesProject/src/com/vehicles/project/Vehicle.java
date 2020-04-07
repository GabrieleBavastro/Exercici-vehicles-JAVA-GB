package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	private String plate;
	private String brand;
	private String color;
	List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}

	public Vehicle() {

	}

	public String getPlate() {// Getter.
		return plate;
	}

	public String getBrand() {// Getter.
		return brand;
	}

	public String getColor() {// Getter.
		return color;
	}

	public List<Wheel> getWheels() {// Getter.
		return wheels;
	}

	public void setPlate(String plate) {// Setter.
		this.plate = plate;
	}

	public void setBrand(String brand) {// Setter.
		this.brand = brand;
	}

	public void setColor(String color) {// Setter.
		this.color = color;
	}

	public void setWheels(List<Wheel> wheels) {// Setter.
		this.wheels = wheels;
	}
}
