package com.tuitioncenter;

public class Name {
    private String fName;
    private String mName;
    private String lName;

    public Name(){}

    public Name(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return fName + " " + mName + " "+ lName;
    }
}
