package com.tuitioncenter;

public class Address {
    private String unitNo;
    private String street;
    private String postcode;
    private String district;
    private String state;

    public Address(){}
    public Address(String unitNo, String street, String postcode, String district, String state) {
        this.unitNo = unitNo;
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }

    @Override
    public String toString() {
        return unitNo + " " + street + " " + " " + postcode + " " + district + " " + state;
    }
}
