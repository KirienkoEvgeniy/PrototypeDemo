package org.demo;

public class User implements Clonn {
    private String name = "TestName";
    private String lastName = "TestLastName";
    private double age = 29;
    private Address address = new Address();

    public User(String name, String lastName, double age, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public User shallowCopy() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public User deepCopy() throws CloneNotSupportedException {
        User user = (User) super.clone();
        user.address = (Address) address.clone();
        return user;
    }
}
