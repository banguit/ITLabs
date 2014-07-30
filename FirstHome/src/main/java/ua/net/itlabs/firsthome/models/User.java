package ua.net.itlabs.firsthome.models;

public class User {

    private int _id;
    private String _firstName;
    private String _lastName;

    public User (int id, String firstName, String lastName) {
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        this._id = id;
    }

    public String getFirstName() {
        return this._firstName;
    }

    public void setFirstName(String firstName) {
        this._firstName = firstName;
    }

    public String getLastName() {
        return this._lastName;
    }

    public void setLastName(String lastName) {
        this._lastName = lastName;
    }
}
