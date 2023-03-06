package com.tuitioncenter;

public class Tutor {
    private Name name;
    private Address address;
    private String IC;
    private String qualification;
    private int numYearExp;
    private int numYearInCentre;

    public Tutor(){}

    public Tutor(Name name, Address address, String IC, String qualification, int numYearExp, int numYearInCentre) {
        this.name = name;
        this.address = address;
        this.IC = IC;
        this.qualification = qualification;
        this.numYearExp = numYearExp;
        this.numYearInCentre = numYearInCentre;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "name=" + name +
                ", address=" + address +
                ", IC='" + IC + '\'' +
                ", qualification='" + qualification + '\'' +
                ", numYearExp=" + numYearExp +
                ", numYearInCentre=" + numYearInCentre +
                '}';
    }
}
