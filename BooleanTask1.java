//Task1:
/*Дано целое число A. Проверить истинность высказывания: «Число
A является положительным».*/
public class IntegerTask1 {
	public static void main (String [] args ) {
	int numA = 5;
	boolean negativeOrPositive = numA>0;
		System.out.println("Число А положительное и это " + negativeOrPositive);
	}
}
//Console: Число А положительное и это true;

//Task2:
/*Дано целое число A. Проверить истинность высказывания: «Число A
является нечетным».*/
public class IntegerTask2 {
	public static void main (String [] args ) {
	int numA = 5;
	boolean evenOrOdd = numA%2 != 0;
		System.out.println("Является ли число А нечетным и это " + evenOrOdd);
	}
}
//Console: Число А нечетное и это true;

//Task3:
/*Дано целое число A. Проверить истинность высказывания: «Число A
является четным».*/
public class IntegerTask3 {
	public static void main (String [] args ) {
	int numA = 5;
	boolean evenOrOdd = numA%2 == 0;
		System.out.println("Является ли число А четным и это " + evenOrOdd);
	}
}
//Console: Число А нечетное и это false;

//Task4:
/*Даны два целых числа: A, B. Проверить истинность высказывания:
«Справедливы неравенства A > 2 и B <= 3».*/
public class IntegerTask4 {
	public static void main (String [] args ) {
	int numA = 5;
	int numB = 3;
	boolean inequality =  numA > 2 && numB <= 3;
		System.out.println("Справедливы неравенства A > 2 и B <= 3 и это " + inequality);
	}
}
//Console: Справедливы неравенства A > 2 и B <= 3 и это true;

//Task5:
/*Даны два целых числа: A, B. Проверить истинность высказывания:
«Справедливы неравенства A >= 0 или B < –2».*/
public class IntegerTask5 {
	public static void main (String [] args ) {
	int numA = 5;
	int numB = 3;
	boolean inequality =  numA >= 0 && numB < -2;
		System.out.println("Справедливы неравенства numA >= 0 && numB < -2 и это " + inequality);
	}
}
//Console: Справедливы неравенства numA >= 0 && numB < -2  и это false;