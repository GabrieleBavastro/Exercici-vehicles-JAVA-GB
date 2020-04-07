package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateVehicles {

	public static Scanner scanner = new Scanner((System.in));

	public String askVehicle() {
		System.out.println("Do you want to enter a car or a bike?");
		String input = scanner.next().toLowerCase();

		while (!(input.equals("car") || input.equals("bike"))) {
			System.out.println("Please, which kind of vehicle do you want to enter? A car or a bike?");
			input = scanner.next().toLowerCase();
		}
		System.out.println("You chosed create a " + input);
		return input;
	}

	public String askPlate() throws Exception {
		System.out.println("Please write the plate. (E.g.: 1234-AB | 1234-ABC)");
		String plate = scanner.next();
		// The plate have to be 1234-AB (length = 7) or 1234-ABC (length = 8).
		while (!plateCorrect(plate)) {
			plate = askAgainThePlate();
		}
		return plate;
	}

	private boolean plateCorrect(String plate) {
		String[] out = plate.split("-");

		// check if it is the first class of structure 1234-AB
		if (out.length == 2 && plate.length() == 7) {
			if (!out[0].matches("[0-9]+"))
				return false;
			if (!out[1].matches("[a-zA-Z]+"))
				return false;
			return true;
		}

		// check if it is the second class of structure 1234-ABC
		if (out.length == 2 && plate.length() == 8) {
			if (!out[0].matches("[0-9]+"))
				return false;
			if (!out[1].matches("[a-zA-Z]+"))
				return false;
			return true;
		}
		return false;
	}

	// If plate not correct enter in askAgainThePlate()
	private String askAgainThePlate() {
		System.out.println("Incorrect Format! Plate must be of 4 digits and 2 or 3 letters "
				+ "(e.g. 1234-AB or 1234-ABC). Please try again.");
		return scanner.next();
	}

	public String askBrand() {
		System.out.println("Please introduce the brand of your vehicle.");
		return (scanner.next());
	}

	public String askColor() {
		System.out.println("Please introduce the color of your vehicle.");
		return (scanner.next());
	}

	public List<Wheel> askWheels(String location) {
		CreateVehicles userVehicle = new CreateVehicles();
		List<Wheel> wheels = new ArrayList<>();

		Wheel leftWheel = new Wheel(userVehicle.askBrandWheels(location, "left"),
				userVehicle.askDiameterWheels(location, "left"));
		wheels.add(leftWheel);
		Wheel rightWheel = new Wheel(userVehicle.askBrandWheels(location, "right"),
				userVehicle.askDiameterWheels(location, "right"));
		wheels.add(rightWheel);
		return wheels;
	}

	private String askBrandWheels(String wheelsLocation, String position) {
		System.out.println("Please introduce the brand of the " + position + " " + wheelsLocation + " wheel.");
		return (scanner.next());
	}

	public double askDiameterWheels(String wheelsLocation, String position) {

		System.out.println("Please introduce the diameter of the " + position + " " + wheelsLocation
				+ " wheel. (Introduce a number between 0.4 and 4)");
		String input = scanner.next();
		while ((Double.parseDouble(input) <= 0.4) || (Double.parseDouble(input) >= 4)) {
			System.out.println("Incorrect Format! Please enter again the diameter of the " + position + " "
					+ wheelsLocation + " wheel. (between 0.4 and 4)");
			input = scanner.next();
		}
		return Double.parseDouble(input);
	}

	public CreateVehicles() {

	}

	public List<Wheel> askWheel(String location) {
		List<Wheel> wheels = new ArrayList<>();
		CreateVehicles userVehicle = new CreateVehicles();

		Wheel wheel = new Wheel(userVehicle.askBrandWheels(location, ""), userVehicle.askDiameterWheels(location, ""));
		wheels.add(wheel);

		return wheels;
	}

	public void showCarInfo(Car car) {
		System.out.println("Your car has been created! \n" + "Plate: " + car.getPlate() + ". - Brand: " + car.getBrand()
				+ ". - Color: " + car.getColor() + ".");
		System.out.print("You chosed the following wheels: \n");
		for (Wheel wheel : car.getWheels()) {
			System.out.print("Brand: " + wheel.getBrand() + ". Diameter: " + wheel.getDiameter() + "\n");
		}
	}

	public void showBikeInfo(Bike bike) {

		System.out.println("Your bike has been created! \n" + "Plate: " + bike.getPlate() + ". - Brand: "
				+ bike.getBrand() + ". - Color: " + bike.getColor() + ".");
		System.out.print("You chosed the following wheels: \n");
		for (Wheel wheel : bike.getWheels()) {
			System.out.print("Brand: " + wheel.getBrand() + ". Diameter: " + wheel.getDiameter() + "\n");

		}
	}
}