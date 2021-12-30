package leafnoise.ejercicio1;

public class Conversion {

	public String[] stringToArray(String stringOfNumbers) throws CharacterInvalidException {
		String[] characters;

		if (stringOfNumbers.contains("-")) {
			throw new CharacterInvalidException("The string has a negative number.");
		} else {
			return characters = stringOfNumbers.split(",");
		}
	}

	public Integer sumOfNumbers(String[] characters) {
		Integer result = 0;
		for (int i = 0; i < characters.length; i++) {
			result += Integer.valueOf(characters[i]);
		}
		return result;
	}
}
