package com.company;

import com.company.Person;

public class CleaningStaff extends Person {

    String dayOff;

    public CleaningStaff(String name, String identification, int age, String dayOff){
        this.name= name;
        this.identification = identification;
        this.age = age;
        this.dayOff=dayOff;
    }

    public String getDayOff() {
        return dayOff;
    }

    public void setDayOff(String dayOff) {
        this.dayOff = dayOff;
    }


}
