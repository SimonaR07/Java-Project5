package Proekt1;

public class Main {
	
	    public static void main(String[] args) {
	    	
	        // Креирање на инстанца од Car користејќи го дефолтниот конструктор
	        Car defaultCar = new Car();
	        System.out.println(" Default Car: " + defaultCar);

	        // Креирање на инстанца од Car користејќи го параметризираниот конструктор
	        Car customCar = new Car("Toyota", "Camry", 2022);
	        System.out.println(" Custom Car: " + customCar);
	    }
	}

