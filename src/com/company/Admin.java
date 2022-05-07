package com.company;

import com.company.Person;

public class Admin extends Person {

    String leader ;
    String parking;

    public Admin (String name, String identification, int age, String leader, String parking){
        this.name = name;
        this.identification = identification;
        this.age = age;
        this.leader = leader;
        this.parking = parking;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getLeader() {
        return leader;
    }

    public String getParking() {
        return parking;
    }


}
