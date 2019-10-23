//Task1:
/*Дано расстояние L в сантиметрах. Используя операцию деления наце-
ло, найти количество полных метров в нем (1 метр = 100 см).*/

public class IntegerTask1 {
	public static void main (String [] args ) {
	int centimetre = 2019;
	int meter = centimetre/100;
		System.out.println(meter + "m");
	}
}
Console: 20m;

//Task2:
/*Дана масса M в килограммах. Используя операцию деления нацело,
найти количество полных тонн в ней (1 тонна = 1000 кг).*/

public class IntegerTask2 {
	public static void main (String [] args ) {
	int kilogram =15624;
	int ton = kilogram/1000;
		System.out.println(ton + "t");
	}
}
Console: 15t;

//Task3:
/*Дан размер файла в байтах. Используя операцию деления нацело,
найти количество полных килобайтов, которые занимает данный файл
(1 килобайт = 1024 байта).*/

public class IntegerTask3 {
	public static void main (String [] args ) {
	int fileByte =77646;
	int kilobyte = fileByte/1024;
		System.out.println(kilobyte + "kb");
	}
}
Console: 75kb;

//Task4:
/*Даны целые положительные числа A и B (A > B). На отрезке длины A
размещено максимально возможное количество отрезков длины B (без на-
ложений). Используя операцию деления нацело, найти количество отрез-
ков B, размещенных на отрезке A.*/

public class IntegerTask4 {
	public static void main (String [] args ) {
	int segmentA = 6;
	int segmentB = 2;
	int segments = segmentA/segmentB;
		System.out.println(segments + " segments");
	}
}
Console: 3 segments;

//Task5:
/*Даны целые положительные числа A и B (A > B). На отрезке длины A
размещено максимально возможное количество отрезков длины B (без на-
ложений). Используя операцию взятия остатка от деления нацело, найти
длину незанятой части отрезка A.*/

public class IntegerTask1 {
	public static void main (String [] args ) {
	int segmentA = 65;
	int segmentB = 24;
	int segments = segmentA%segmentB;
		System.out.println(segments + " остаток от длинны незанятой части отрезка A");
	}
}
Console: 17 остаток от длинны незанятой части отрезка A;