package entities;

public class ImportedProduct extends Product{

	private Double customsFee;
	
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name,price);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
		
	}
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s $ %.2f (Customs fee: $ %.2f)",name,totalPrice(),customsFee));
		
		return sb.toString();
	}
	
	
	
	
	
	
	
}
