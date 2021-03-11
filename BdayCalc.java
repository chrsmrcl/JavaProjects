import java.time.LocalDate;
import java.time.Period;

public class BdayCalc {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1990, 1, 20);
		int years = Period.between(birthDate, today).getYears();

		System.out.println("Today is " +(today));
		System.out.println("Your birthday is " +(birthDate));
		System.out.println("Your age is " +(years));
	}

}
