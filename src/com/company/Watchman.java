package com.company;

import com.company.Person;

public class Watchman extends Person {

    String weapon;
    String workDay;

    public Watchman(String name, String identification, int age, String weapon, String workDay){
        this.name= name;
        this.identification = identification;
        this.age = age;
        this.weapon= weapon;
        this.workDay= workDay;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getWorkDay() {
        return workDay;
    }
}
