package org.example.Models;

public class Films {

    private String name;
    private String producer;
    private double time;

    public Films(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Films(String name, String producer, double time) {
        this.name = name;
        this.producer = producer;
        this.time = time;
    }
}
