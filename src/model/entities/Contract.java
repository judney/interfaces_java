package model.entities;


import java.util.Date;

public class Contract {

	private int number ; 
	private Date date ; 
	private Double totalValue  ;
	
	public Contract () {}

	public Contract(int number, Date date, Double totalValue) {
	
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	@Override
	public String toString() {
		return "Contract [number=" + number + ", date=" + date + ", totalValue=" + totalValue + "]";
	} 
	
	
	
	
	
	
	
	
	
}
