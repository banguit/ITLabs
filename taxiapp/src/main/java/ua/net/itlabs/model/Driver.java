package ua.net.itlabs.model;

public class Driver {

    private long id;
    private String firstName;
    private String lastName;
    private String autoPlate;
    private String brand;
    private String model;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAutoPlate() {
        return autoPlate;
    }

    public void setAutoPlate(String autoPlate) {
        this.autoPlate = autoPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
