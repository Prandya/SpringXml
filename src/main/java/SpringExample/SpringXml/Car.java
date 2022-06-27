package SpringExample.SpringXml;

public class Car {

	private int model_no;
	private String name;
	private Engine carengg; 
	
	public Car() {
		super();
	}

	public Car(int model_no, String name, Engine carengg) {
		super();
		System.out.println("All para con invkoed");
		this.model_no = model_no;
		this.name = name;
		this.carengg = carengg;
	}
	
	
	public Car(Engine carengg) {
		super();
		System.out.println("Eng con invoked");
		this.carengg = carengg;
	}

	public int getModel_no() {
		return model_no;
	}

	public void setModel_no(int model_no) {
		this.model_no = model_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Engine getCarengg() {
		return carengg;
	}

	public void setCarengg(Engine carengg) {
		this.carengg = carengg;
	}

	@Override
	public String toString() {
		return "Car [model_no=" + model_no + ", name=" + name + ", carengg=" + carengg + "]";
	}
	
	

}