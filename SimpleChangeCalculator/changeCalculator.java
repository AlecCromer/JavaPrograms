import java.text.DecimalFormat;

public class changeCalculator {
	DecimalFormat df = new DecimalFormat("#.00");
	private double pennies,nickels,quarters,dimes;

	private double getPennies() {
		return pennies;
	}

	private double getNickels() {
		return nickels;
	}

	private double getQuarters() {
		return quarters;
	}

	private double getDimes() {
		return dimes;
	}
	
	public String toString() {
		return String.valueOf(dollarNotation(getPennies(), getNickels(), getQuarters(), getDimes()));
	}

	//constructor assigns
	public changeCalculator(double pennies, double nickels, double quarters, double dimes) {
		this.pennies = pennies;
		this.nickels = nickels;
		this.quarters = quarters;
		this.dimes = dimes;

	}

	//converts change to dollar amount
	public String dollarNotation(double pennies, double nickels, double quarters, double dimes) {
		double total = 0.00;
		total = total + (pennies*.01);
		total = total + (nickels*.05);
		total = total + (quarters*.25);
		total = total + (dimes*.1);
		return df.format(total);
	}
}
