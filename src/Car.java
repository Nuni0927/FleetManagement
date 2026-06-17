public class Car extends Vehicles {
    private String licensePlate;
    private String vehicleType;
    private String fuelType;
    private String transmissionType;
    private int speed;
    private String location;
    private int maxSpeed;


    // Add ALL the missing parameters here ↓↓↓
    public Car(String brand, int year, String model, String transmissionType,
               String licensePlate, String vehicleType, String fuelType, int maxSpeed) {

        super(brand, year, model); // Only 3 - matches Vehicles constructor
        this.transmissionType = transmissionType;
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.location = location;
    }


        // getters


    public String getLicensePlate() {
        return licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getSpeed() {
        return speed;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //Setters only for things that change


    public void setSpeed(int speed) {
        if (speed >=0 && speed <= maxSpeed){
            this.speed = speed;
        }else {
            System.out.println("Invalid speed max speed is " + maxSpeed);
        }
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;

    }
// Override method
    @Override
    public void drive(){
        System.out.println(getBrand() + " " + getModel() + " plate no: " + " [" +  getLicensePlate() + "] " + " is moving at " + getSpeed() + " km/h" );
    }

    @Override
    public void stop(){
        System.out.println(getBrand() + " " + getModel() + " plate no: " +" [" + getLicensePlate() +  "] " + " has stopped at " + getLocation() );
    }


}




