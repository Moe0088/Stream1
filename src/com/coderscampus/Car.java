package com.coderscampus;

import java.util.Objects;

public class Car {

	private String brand;
	private String model;
	private Integer year;

	public Car(String brand, String model, Integer year) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, model, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equalsIgnoreCase(brand, other.brand) && 
				Objects.equalsIgnoreCase(model, other.model)
				&& Objects.equals(year, other.year);
	}
	

}
