package com.vehicles.project;

import java.util.Objects;

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
	
	public boolean equals(Object compareWheels) {
		if (this == compareWheels) return true;
		if (compareWheels == null || getClass() != compareWheels.getClass()) return false;
		Wheel wheel = (Wheel) compareWheels;
		return Double.compare(wheel.getDiameter(), getDiameter()) == 0 &&
				Objects.equals(getBrand(), wheel.getBrand());
	}
}