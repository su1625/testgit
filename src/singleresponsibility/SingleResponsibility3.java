package singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 vehicle = new Vehicle1();
		vehicle.runRoad("Ħ�г�");
		vehicle.runRoad("����");
		vehicle.runAir("�ɻ�");
	}
}
class Vehicle1{
	public void runRoad(String vehicle) {
		System.out.println(vehicle+"�ڹ�·������...");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle+"��ˮ������...");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle+"����շ���...");
	}
}
