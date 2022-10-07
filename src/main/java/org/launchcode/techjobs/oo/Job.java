package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer,Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof  Job)){
            return false;
        }
        Job job1 = (Job) o;
        return  getId() == job1.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    @Override
    public String toString(){ // Ternary Operator - (variable = Expression1 ? Expression2 : Expression3)

        if(this.name == null || this.name.isEmpty()){
            return this.name = "Data not available";
        }
        if(employer.getValue().equals("") || employer.getValue() == null){
            employer.setValue("Data not available");
        }
        if((location.getValue().equals("") || location.getValue() == null)){
            location.setValue("Data not available");
        }
        if((positionType.getValue().equals("") || positionType.getValue() == null)){
            positionType.setValue("Data not available");
        }
        if((coreCompetency.getValue().equals("") || coreCompetency.getValue() == null)){
            coreCompetency.setValue("Data not available");
        }

        return // if value is not equal to null and is empty then it equals "Data is not available
                "\nID: " + id + "\n" +
                "Name: " + name  + "\n" +
                "Employer: " + employer  + "\n" +
                "Location: " + location + "\n" +
                        "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency + "\n";
    }



    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){
      this.name = name;
      return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


}
