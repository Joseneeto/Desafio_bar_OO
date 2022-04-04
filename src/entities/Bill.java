package entities;

public class Bill {
	
	public static final double BEER_PRICE = 5.00;
	public static final double SOFT_DRINK_PRICE = 3.00;
	public static final double FOOD_PRICE = 7.00;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		if(feeding() > 30.0) {
			return 0.0;
		}else {
			return 4.00;
		}
	}
	
	public double feeding() {
		return ((double)beer * BEER_PRICE +  softDrink * SOFT_DRINK_PRICE + barbecue * FOOD_PRICE);
	}
	
	public double ticket() {
		if(gender == 'F' || gender =='f') {
			return 8.00;
		}else {
			return 10.00;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}

}

