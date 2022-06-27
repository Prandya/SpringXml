package SpringExample.SpringXml;

import java.util.List;

public class Engine {

	private String type;
	private int eng_no;
	private List<String> power;
	
		
	public Engine() {
		super();
	}

	public Engine(String type,int eng_no,List<String> power)
	{
		this.type=type;
		this.eng_no=eng_no;
		this.power=power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEng_no() {
		return eng_no;
	}

	public void setEng_no(int eng_no) {
		this.eng_no = eng_no;
	}

	public List<String> getPower() {
		return power;
	}

	public void setPower(List<String> power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", eng_no=" + eng_no + ", power=" + power + "]";
	}
	

}

