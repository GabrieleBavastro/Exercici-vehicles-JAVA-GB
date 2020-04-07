package com.vehicles.project;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		// Create the arrays for keep the information about vehicle and wheels.
		CreateVehicles userVehicle = new CreateVehicles();
		List<Wheel> frontWheels = new ArrayList<>();
		List<Wheel> backWheels = new ArrayList<>();
		// ask if must be created a car or a bike.
		switch (userVehicle.askVehicle()) {

		case "car":
			// Ask for the required info about the car.
			Car car = new Car(userVehicle.askPlate(), userVehicle.askBrand(), userVehicle.askColor());
			// Ask for the 2 wheels front and the 2 back.
			frontWheels = userVehicle.askWheels("front");
			backWheels = userVehicle.askWheels("back");
			// Add wheels in the array.
			car.addWheels(frontWheels, backWheels);
			// Resume the info about the car and the Wheels created.
			userVehicle.showCarInfo(car);
			break;

		case "bike":
			// Ask for the required info about the bike.
			Bike bike = new Bike(userVehicle.askPlate(), userVehicle.askBrand(), userVehicle.askColor());
			// Ask for the front wheel and for the back wheel.
			frontWheels = userVehicle.askWheel("front");
			backWheels = userVehicle.askWheel("back");
			// Add wheels in the array.
			bike.addWheels(frontWheels.get(0), backWheels.get(0));
			// Resume the info about the bike and the Wheels created.
			userVehicle.showBikeInfo(bike);
			break;
		}
	}
}
