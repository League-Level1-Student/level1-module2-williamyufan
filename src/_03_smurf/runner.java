package _03_smurf;

public class runner {
public static void main(String[] args) {
	Smurf handysmurf=new Smurf("Handy Smurf");
	System.out.println(handysmurf.getName());
	handysmurf.eat();
	Smurf papasmurf=new Smurf("Papa Smurf");
	System.out.println(papasmurf.getName());
	papasmurf.eat();
	Smurf smurfette=new Smurf("smurfette");
	System.out.println(smurfette.getName());
	smurfette.eat();
}
}
