import java.util.ArrayList;
import java.util.List;

public class Destination {
    public String name;
    private List<Activity> activities;
    private  List<Passenger>passengers;
    private TravelPackage travelPackage;

    public TravelPackage getTravelPackage() {
        return travelPackage;
    }

    public Destination(String name, TravelPackage travelPackage) {
        this.name = name;
        this.activities = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.travelPackage = travelPackage;
    }

    public void setTravelPackage(TravelPackage travelPackage) {
        this.travelPackage = travelPackage;
    }

    // all args constructor
    public Destination(String name, List<Activity> activities) {
        this.name = name;
        this.activities = activities;
        passengers = new ArrayList<>();
    }

    public Destination(String name, List<Activity> activities, List<Passenger> passengers) {
        this.name = name;
        this.activities = activities;
        this.passengers = passengers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
        this.passengers= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Activity> getActivities() {
        return this.activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
