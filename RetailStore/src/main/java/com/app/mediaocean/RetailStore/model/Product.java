package com.app.mediaocean.RetailStore.model;

/**
 * @author vipal kaila
 *
 */
public class Product {

	private int productId;
	private String productName;
	private String productCategory;
	private int quantity;
	private double cost;
	private double totalCost;
	private double salesTax;
	
	
	public Product(int productId,String productName, double cost,int quantity,
			String productCategory) {
		this.productId = productId;
		this.productName = productName;
		this.cost = cost;
		this.quantity = quantity;
		this.productCategory = productCategory;
	}
	
	public Product() {
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((productCategory == null) ? 0 : productCategory.hashCode());
		result = prime * result + productId;
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + quantity;
		temp = Double.doubleToLongBits(salesTax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(cost) != Double
				.doubleToLongBits(other.cost))
			return false;
		if (productCategory == null) {
			if (other.productCategory != null)
				return false;
		} else if (!productCategory.equals(other.productCategory))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(salesTax) != Double
				.doubleToLongBits(other.salesTax))
			return false;
		if (Double.doubleToLongBits(totalCost) != Double
				.doubleToLongBits(other.totalCost))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productCategory=" + productCategory
				+ ", quantity=" + quantity + ", cost=" + cost + ", totalCost="
				+ totalCost + ", salesTax=" + salesTax + "]";
	}

	
	
	
	
}
