package edu.training.lesson04.main;

public class ExampleBrick {

	public static void main(String[] args) {
		double a = 10, b = 8;
		double x = 9, y = 9, z = 20;
		
		if (a > x || a > y || a > z) {
			if (b > x) {
				System.out.println("Проидет.");
			} else if (b > y) {
				System.out.println("Проидет.");
			} else if (b > z) {
				System.out.println("Проидет.");
			} else {
				System.out.println("Не проидет.");
			}
		} else {
			System.out.println("Не проидет.");
		}
	}

}
