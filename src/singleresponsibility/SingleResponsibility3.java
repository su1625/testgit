package singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 vehicle = new Vehicle1();
		vehicle.runRoad("摩托车");
		vehicle.runRoad("汽车");
		vehicle.runAir("飞机");
	}
}
class Vehicle1{
	public void runRoad(String vehicle) {
		System.out.println(vehicle+"在公路上运行...");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle+"在水中运行...");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle+"在天空飞行...");
	}
}
