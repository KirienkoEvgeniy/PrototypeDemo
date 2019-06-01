package org.demo;

public class Address implements Cloneable{
    private String city = "TestCity";
    private String street = "TestStreet";
    private int house = 2;

    public Address(String city, String street, int house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
