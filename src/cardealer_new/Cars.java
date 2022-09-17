package cardealer_new;

import java.io.Serializable;

public class Cars implements Serializable {

	private int carID;
	private String maker;
	private String model;
	private String type;
	private int year;
	private int mileage;
	private double price;
	
	public Cars(int carID, String maker, String model, String type, int year, int mileage, double price) {
		super();
		this.carID = carID;
		this.maker = maker;
		this.model = model;
		this.type = type;
		this.year = year;
		this.mileage = mileage;
		this.price = price;
	}

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cars [carID=" + carID + ", maker=" + maker + ", model=" + model + ", type=" + type + ", year=" + year
				+ ", mileage=" + mileage + ", price=" + price + "]";
	}
	
	
}