package com.vehicles.project;

import com.vehicles.project.Wheel;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	public Wheel() {
	}

	public String getBrand() {// Getter.
		return brand;
	}

	public double getDiameter() {// Getter.
		return diameter;
	}

	public void setBrand(String brand) {// Setter.
		this.brand = brand;
	}

	public void setDiameter(double diameter) {// Setter.
		this.diameter = diameter;
	}
}