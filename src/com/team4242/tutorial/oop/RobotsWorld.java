package com.team4242.tutorial.oop;

public class RobotsWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to a robot's world!");
		
		Robot firstRobot = new Robot();
		printRobotInfo(firstRobot);
		
		Robot secondRobot = new Robot();
		printRobotInfo(secondRobot);
	}
	
	private static void printRobotInfo(Robot robot) {
		System.out.println("Robot object ID: " + robot);
	}

}
