package programming;

import java.util.List;

public class FP01Functional {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,19,23,15,0,77,29,16,18);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS"
				+ "PCF", "Azure", "Docker", "Kubernetes");
				
//		printAllNumbersInListFunctional(numbers);
//		printEvenNumbersInListFunctional(numbers);
//		printOddNumbersInListFunctional(numbers);
//		printAllCoursesInListFunctional(courses);
//		printCoursesWithSpringInListFunctional(courses);
//		printCoursesWithFourLettersInListFunctional(courses);
//		printSquaresOfAllNumbersInListFunctional(numbers);
//		printCubesOfAllNumbersInListFunctional(numbers);
		printLengthOfCoursesinListFunctional(courses);
	}

	private static void printLengthOfCoursesinListFunctional(List<String> courses) {
		
		// Focusing on what to do
		courses.stream()
			.map(course -> course + " " + course.length())
			.forEach(System.out::println);
	}

	private static void printCoursesWithFourLettersInListFunctional(List<String> courses) {
		
		// Focusing on what to do
		courses.stream()
			.filter(course -> course.length() >= 4)
			.forEach(System.out::println);
	}

	private static void printCoursesWithSpringInListFunctional(List<String> courses) {
		
		// Focusing on what to do
		courses.stream()
			.filter(course -> course.contains("Spring"))
			.forEach(System.out::println);
	}

	private static void printAllCoursesInListFunctional(List<String> courses) {
		
		// Focusing on what to do
		courses.stream()
			.forEach(System.out::println);
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		// Focusing on what to do
		numbers.stream()
			.forEach(System.out::println); // Method Reference
	}
	
	private static void printSquaresOfAllNumbersInListFunctional(List<Integer> numbers) {
		
		// Focusing on what to do
		numbers.stream()
			.map(number -> number * number)
			.forEach(System.out::println); // Method Reference
	}
	
	private static void printCubesOfAllNumbersInListFunctional(List<Integer> numbers) {
		
		// Focusing on what to do
		numbers.stream()
			.map(number -> number * number * number)
			.forEach(System.out::println); // Method Reference
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
			
		// Focusing on what to do
		numbers.stream()
			.filter(number -> number % 2 == 0) // Lambda Expression
			.forEach(System.out::println); // Method Reference
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		
		// Focusing on what to do
		numbers.stream() // Convert to Stream
			.filter(number -> number % 2 != 0) // Lambda Expression
			.forEach(System.out::println); // Method Reference
	}
}
