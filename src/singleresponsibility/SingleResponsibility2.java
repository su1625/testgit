package singleresponsibility;

public class SingleResponsibility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("摩托车");
		roadVehicle.run("汽车");
		
		AirVehicle rirVehicle = new AirVehicle();
		rirVehicle.run("飞机");
	}
}


class RoadVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"在公路上运行...");
	}
}

class WaterVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"在水中运行...");
	}
}

class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"在天上飞...");
	}
}