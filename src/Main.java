/*
* Written by
* @Keamohetsoe M
* */
public class Main {

       public static void main(String []args){

        int carCount = 0;


 Car mycar = new Car("BMW", 1998,"E30,m3","Manual","WhAM27","Sedan","Petrol",220);


        System.out.println("Car: " + mycar.getBrand() + " " + mycar.getModel());
        System.out.println("Plates: " + mycar.getLicensePlate());
        System.out.println("Max speed: " + mycar.getMaxSpeed());
        carCount++;

        mycar.drive();
        mycar.setSpeed(100);
        mycar.stop();
        mycar.setLocation("Durban");

        System.out.println("\n");


        Car mycar1 = new Car("VW",1998,"Golf mk2","Manual","Bl43ZZ","Hatchback","Petrol",220);


        System.out.println("Car: " + mycar1.getBrand() + " " + mycar1.getModel());
        System.out.println("Plates: " + mycar1.getLicensePlate());
        System.out.println("Max speed: " + mycar1.getMaxSpeed());
            carCount++;

        mycar1.drive();
        mycar1.setSpeed(180);
        mycar1.stop();
        mycar1.setLocation("Soweto");

        System.out.println("\n");

        Car mycar2 = new Car("Ford",2023,"Ranger XLT","Automatic","ASD89GP","Bakkie","Diesel",220);



        System.out.println("Car: " + mycar2.getBrand() + " " + mycar2.getModel());
        System.out.println("Plates: " + mycar2.getLicensePlate());
        System.out.println("Max speed: " + mycar2.getMaxSpeed());
        carCount++;

        mycar2.drive();
        mycar2.setSpeed(180);
        mycar2.stop();
        mycar2.setLocation("Soweto");

        System.out.println("\n");

        Car mycar3 = new Car("Nissan",2006,"NP200","Manual","GAGA33GP","Van","petrol",220);



        System.out.println("Car: " + mycar3.getBrand() + " " + mycar3.getModel());
        System.out.println("Plates: " + mycar3.getLicensePlate());
        System.out.println("Max speed: " + mycar3.getMaxSpeed());
        carCount++;

        mycar3.drive();
        mycar3.setSpeed(180);
        mycar3.stop();
        mycar3.setLocation("Soweto");

        System.out.println("\n");

        System.out.println("TOTAL CARS OWNED: " + carCount);

    }
}

