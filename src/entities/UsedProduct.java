package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManuFactureDate() {
		return manufactureDate;
	}
	
	public void setManuFactureDate(Date manuFactureDate) {
		this.manufactureDate = manuFactureDate;
	}
	
	@Override 
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s (used) $ %.2f (Manufacture date: %s)",name,price,sdf.format(manufactureDate)));
	
		return sb.toString();
	}
	
}