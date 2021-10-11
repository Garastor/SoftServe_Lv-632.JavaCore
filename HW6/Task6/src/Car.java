abstract public class Car {

	private String model;
	private int maxSpeed;
	private int yearOfManufacture;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		
		this.yearOfManufacture = yearOfManufacture;
	}

	// constructors
	public Car() {
	}

	public Car(String model, int maxSpeed, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	}

	// methods

	public abstract void run();

	public abstract void stop();

}
