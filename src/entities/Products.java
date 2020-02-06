package entities;

//Criar uma calsse Products

public class Products {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
   
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return this.name
				+ ", $ "
				+ String.format("%.2f", this.price)
				+ ", "
				+ this.quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
		
	}

}
