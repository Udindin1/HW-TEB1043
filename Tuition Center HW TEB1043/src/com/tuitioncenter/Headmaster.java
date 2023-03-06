package com.tuitioncenter;

public class Headmaster {
    private Name name;
    private Address address;
    private Tutor[] staff;
    private int currentStaffSize;

    public Headmaster(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Name getName(){
        return name;
    }

    public Address getAddress(){
        return address;
    }

}
