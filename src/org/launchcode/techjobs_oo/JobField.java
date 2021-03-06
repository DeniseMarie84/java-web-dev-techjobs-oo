package org.launchcode.techjobs_oo;

import java.util.Objects;

abstract public class JobField {
    public int id;
    public static int nextId = 1;
    public String value;

    public JobField(){
        id = nextId;
        nextId++;
    }
    public JobField(String value){
        this();
        this.value = value;

        if (this.value.isBlank()){
            this.setValue("Data not available");
        }
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
