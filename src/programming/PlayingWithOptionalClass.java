package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptionalClass {

	public static void main(String[] args) {

		List<String> fruits = List.of("apple", "banana", "mango");
	
		Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
		Optional<String> optional = fruits.stream().filter(predicate).findFirst();
		
		System.out.print(optional); // Returns value without an exception
	}
}
