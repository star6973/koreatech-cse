
public class RegularPrice implements Price {
	@Override
	public int getCharge(int daysRented) {
		int price = 2000;
		if(daysRented>2)
			price += (daysRented-2)*1500;
		return price;
	}
}
