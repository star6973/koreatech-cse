
public class ChildrensPrice implements Price {
	@Override
	public int getCharge(int daysRented) {
		int price = 1500;
		if(daysRented>3)
			price += (daysRented-3)*1500;
		return price;
	}
}
