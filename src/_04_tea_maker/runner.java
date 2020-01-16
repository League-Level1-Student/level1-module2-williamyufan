package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class runner {
public static void main(String[] args) {
	TeaBag uu=new TeaBag("uu");
	uu.getFlavor();	
	Kettle ut=new Kettle();
	ut.boil();
	Water hotwater=ut.getWater();
	Cup ty=new Cup();
	ty.makeTea(uu, hotwater);
}
}
