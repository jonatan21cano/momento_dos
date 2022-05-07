package com.company;

public class Accountant extends Person {

    String leader ;
    String parking;

    public Accountant( String name, String identification, int age, String leader, String parking){
        this.name = name;
        this.identification = identification;
        this.age = age;
        this.leader = leader;
        this.parking = parking;
    }

    public String getLeader() {
        return leader;
    }

    public String getParking() {
        return parking;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }


}
