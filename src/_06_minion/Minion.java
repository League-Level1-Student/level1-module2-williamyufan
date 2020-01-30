package _06_minion;

public class Minion {
	String name;
	int Eyes;
	String color;
	String master;
	
	Minion(String name, int Eyes, String color, String master){
		this.name=name;
		this.Eyes=Eyes;
		this.color=color;
		this.master=master;
	}
	public String getName() {
		return name;
	}
	public int getEyes() {
		return Eyes;
	}
	public String getColor() {
		return color;
	}
	
	public String getMaster() {
		return master;
	}
	public String setMaster(String master) {
		return this.master=master;
				}
	}