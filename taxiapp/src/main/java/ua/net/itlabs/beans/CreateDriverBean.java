package ua.net.itlabs.beans;

import ua.net.itlabs.model.Driver;

import java.util.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "createDriverBean")
@SessionScoped
public class CreateDriverBean {

    private Map<String, String> brands = new HashMap<String, String>();

    private Driver driver = new Driver();

    public CreateDriverBean() {
        brands.put("Audi", "Audi");
        brands.put("BMW", "Audi");
        brands.put("Skoda", "Skoda");
        brands.put("Opel", "Opel");
    }

    public Driver getDriver() {
        return this.driver;
    }

    public Map<String, String> getBrands() {
        return this.brands;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
