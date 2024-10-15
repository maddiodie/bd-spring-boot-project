package com.bloomtech.springboot.models;

// this class will hold data being sent in an HTTP request
//
// a POJO is normally used in HTTP requests
// a POJO has data, constructors including a default constructor, standard getters and
//  setters, toString(), equals(), hashCode() methods

import java.util.Objects;

public class theDataForRequest {

    String theData; // the data to send the request
    // the data variable names must math the JSON attributes

    public theDataForRequest() {}
    // should always have a default constructor for a POJO in case java needs it

    public theDataForRequest(String theData) {
        this.theData = theData;
    }

    public String getTheData() {
        return theData;
    }

    public theDataForRequest setTheData(String theData) {
        this.theData = theData;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof theDataForRequest that)) return false;
        return Objects.equals(getTheData(), that.getTheData());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTheData());
    }

    @Override
    public String toString() {
        return "theDataForRequest{" +
                "theData='" + theData + '\'' +
                '}';
    }

}
