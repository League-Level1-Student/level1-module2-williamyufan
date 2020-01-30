package _01_getters_and_setters;

public class Runner {
	public static void main(String[] args) {
		
	
Person joe=new Person();
Person john=new Person();
Person Mike=new Person();
joe.setSuperpower("yy");
john.setSuperpower("ii");
Mike.setSuperpower("oo");
System.out.println(joe.toString());
System.out.println(john.toString());
System.out.println(Mike.toString());
}
}