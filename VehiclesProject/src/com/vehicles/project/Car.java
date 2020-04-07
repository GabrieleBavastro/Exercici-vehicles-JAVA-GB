package com.vehicles.project;

import java.util.List;

import com.vehicles.project.Vehicle;
import com.vehicles.project.Wheel;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	public Car() {
		super();
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) {

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
}
