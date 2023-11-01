package edu.training.lesson04.main;

public class Examples0120 {

	public static void main(String[] args) {
		// Example 01
		int n1 = 1;
		int n2 = 2;

		if (n1 < n2) {
			System.out.println("7");
		} else {
			System.out.println("8");
		}

		// Example02
		if (n1 < n2) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		// Example03
		int a = 3;
		int b = 5;

		if (a == b) {
			System.out.println("Равны");
		} else {
			System.out.println("Не равны");
		}

		// Example04
		if (a == b) {
			System.out.println("Числа равны");
		} else {
			System.out.println("Числа не равны");
		}

		// Example05
		if (a < b) {
			System.out.println("Наименьшее число: " + a);
		} else if (b < a) {
			System.out.println("Наименьшее число: " + b);
		} else {
			System.out.println("Числа равны, либо что-то пошло не так!");
		}

		// Example06
		if (a > b) {
			System.out.println("Наибольшее число: " + a);
		} else if (b > a) {
			System.out.println("Наибольшее число: " + b);
		} else {
			System.out.println("Числа равны, либо что-то пошло не так!");
		}

		// Example07
		int c = 7;
		int x = 9;

		int result = Math.abs(a * x * x + b * x + c);

		System.out.println("Модуль выражения равен " + result);

		// Example08
		if (a * a < b * b) {
			System.out.println("Наименьший квадрат числа: " + a);
		} else if (b * b < a * a) {
			System.out.println("Наименьший квадрат числа: " + b);
		} else {
			System.out.println("Числа равны, либо что-то пошло не так!");
		}

		// Example09
		int a1 = 3;
		int a2 = 3;
		int a3 = 3;

		if (a1 == a2 && a2 == a3) {
			System.out.println("Треугольгик является равносторонним.");
		} else {
			System.out.println("Треугольник разносторонний.");
		}

		// Example10
		double s1 = 13;
		double s2 = 24;

		if (s1 < s2) {
			System.out.println("Наименьшая площадь у круга с площадью: " + s1);
		} else if (s2 < s1) {
			System.out.println("Наименьшая площадь у круга с площадью: " + s2);
		} else {
			System.out.println("Площади равны.");
		}

		// Example11
		if (s1 < s2) {
			System.out.println("Наименьшая площадь у треугольника с площадью: " + s1);
		} else if (s2 < s1) {
			System.out.println("Наименьшая площадь у треугольника с площадью: " + s2);
		} else {
			System.out.println("Площади равны.");
		}

		// Example12
		double num1 = 2;
		double num2 = -3;
		double num3 = 4;

		if (num1 >= 0) {
			num1 = num1 * num1;
		} else {
			num1 = Math.pow(num1, 4);
		}

		if (num2 >= 0) {
			num2 = num2 * num2;
		} else {
			num2 = Math.pow(num2, 4);
		}

		if (num3 >= 0) {
			num3 = num3 * num3;
		} else {
			num3 = Math.pow(num3, 4);
		}
		System.out.println("Новые значения: " + num1 + ", " + num2 + ", " + num3);

		// Example13
		double xx1 = 2.0;
		double yy1 = -3;
		double xx2 = 4;
		double yy2 = 5;

		double length1 = Math.sqrt(xx1 * xx1 + yy1 * yy1);
		double length2 = Math.sqrt(xx2 * xx2 + yy2 * yy2);

		if (length1 < length2) {
			System.out.println(
					"Точка (" + xx1 + ", " + yy1 + ") ближе к началу координат, чем точка (" + xx2 + ", " + yy2 + ")");
		} else if (length1 == length2) {
			System.out.println("Точка (" + xx1 + ", " + yy1 + ") на таком же растоянии от начала координат как точка ("
					+ xx2 + ", " + yy2 + ")");
		} else {
			System.out.println("Точка (" + xx1 + ", " + yy1 + ") дальше от начала координат, чем точка (" + xx2 + ", "
					+ yy2 + ")");
		}

		// Example14
		int corner1 = 60;
		int corner2 = 30;

		int corner3 = 180 - corner1 - corner2;

		if (corner1 > 0 && corner2 > 0 && corner3 > 0) {
			System.out.println("Треугольник существует");

			if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
				System.out.println("Треугольник прямоугольный");
			}
		} else {
			System.out.println("Треугольник не существует");
		}

		// Example15
		double xx = 2.2;
		double yy = 3.3;
		double newX = 0.0;
		double newY = 0.0;

		if (xx < yy) {
			newX = (xx + yy) / 2;
			newY = 2 * xx * yy;
		} else {
			newY = (xx + yy) / 2;
			newX = 2 * xx * yy;
		}
		System.out.println("Для чисел " + xx + " и " + yy + " новые значения: " + newX + " и " + newY);

		// Example16
		if (xx > 0 && yy > 0) {
			System.out.println("Точка (" + xx + ", " + yy + ") находится в 1 четверти");
		} else if (xx < 0 && yy > 0) {
			System.out.println("Точка (" + xx + ", " + yy + ") находится во 2 четверти");
		} else if (xx < 0 && yy < 0) {
			System.out.println("Точка (" + xx + ", " + yy + ") находится в 3 четверти");
		} else if (xx > 0 && yy < 0) {
			System.out.println("Точка (" + xx + ", " + yy + ") находится в 4 четверти");
		} else if (xx == 0 && yy != 0) {
			System.out.println("Точка (" + xx + ", " + yy + ") находится на оси y");
		} else if (xx != 0 && yy == 0) {
			System.out.println("Точка (" + xx + ", " + yy + ") находится на оси x");
		} else if (xx == 0 && yy == 0) {
			System.out.println("Точка (" + xx + ", " + yy + ") находится в начале координат");
		}

		// Example17
		int m = 3;
		int n = 6;

		if (m != n) {
			if (m > n) {
				n = m;
			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;
		}

		System.out.println("Полученные числа: " + m + ", " + n);

		// Example18
		int aa = -3;
		int bb = 2;
		int cc = -5;

		int count = 0;

		if (aa < 0) {
			count++;
		}

		if (bb < 0) {
			count++;
		}

		if (cc < 0) {
			count++;
		}

		System.out.println("Количество отрицательных чисел: " + count);

		// Example19
		int count1 = 0;

		if (aa > 0) {
			count1++;
		}

		if (bb > 0) {
			count1++;
		}

		if (cc > 0) {
			count1++;
		}

		System.out.println("Количество положительных чисел: " + count1);

		// Example20
		int k = 2;

		if (aa % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + aa);
		}
		if (bb % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + bb);
		}
		if (cc % k == 0) {
			System.out.println("Число " + k + " является делителем числа " + cc);
		}

	}

}
