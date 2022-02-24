package entities;

public class Product { 

		private String name;
		private double price;
		private int quantity;
		
		public double totalValueInStock() {  
			return price * quantity;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getQuantity() {
			return quantity;
		}
		public void addQuantity(int newquantity) {
			this.quantity += newquantity;
		}
		public void removeQuantity(int quantity) {
			this.quantity -= quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String toString() {
			return name
					+ ", $ "
					+ String.format("%.2f", this.getPrice()) 
					+ ", "
					+ this.getQuantity()
					+ " units, Total: $ "
					+ String.format("%.2f",totalValueInStock());
		}
		
}
