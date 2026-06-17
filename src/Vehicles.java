public class Vehicles {
    private String brand;
    private int year;
    private String model;


    // constructors

    public Vehicles (String brand, int year, String model){

        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    // Getters


    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
    public void drive(){

    }

    public void stop(){

    }
}
