package _02_sea_creature;

public class runner {
public static void main(String[] args) {
	SeaCreature Spongebob=new SeaCreature("Spongebob");
	Spongebob.eat();
	Spongebob.laugh();
	SeaCreature Squidward=new SeaCreature("Squidward");
	SeaCreature Patrick=new SeaCreature("Patrick");
	System.out.println(Squidward.getName());
	Squidward.eat();
	Squidward.laugh();
	System.out.println(Patrick.getName());
	Patrick.eat();
	Patrick.laugh();
	
}
}
