package com.fullstack.react.instructor;

public class Instructor {
    private String name;
    private int uuid;

    Instructor(String name, int uuid){
        this.name = name;
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }
}