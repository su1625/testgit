package singleresponsibility;

public class SingleResponsibility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("Ħ�г�");
		roadVehicle.run("����");
		
		AirVehicle rirVehicle = new AirVehicle();
		rirVehicle.run("�ɻ�");
	}
}


class RoadVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"�ڹ�·������...");
	}
}

class WaterVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"��ˮ������...");
	}
}

class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"�����Ϸ�...");
	}
}