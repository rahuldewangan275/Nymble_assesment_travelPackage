import java.util.ArrayList;
import java.util.List;

// Activity has name, cost, capacity, Description,
public class Activity {
    private String name;
    private  String Description;
    private double cost;
    private int capacity;
    int currentSpacesAvailable;
    private Destination destination;
    private List<Passenger>passengers;

    public int getCurrentSpacesAvailable() {
        return currentSpacesAvailable;
    }

    public void setCurrentSpacesAvailable(int currentSpacesAvailable) {
        this.currentSpacesAvailable = currentSpacesAvailable;
    }

    public Activity(String name) {
        this.name = name;
    }

    public Activity(String name, String description, double cost, int capacity, Destination destination, List<Passenger> passengers) {
        this.name = name;
        Description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = passengers;
        currentSpacesAvailable = capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        Description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = new ArrayList<>();
        currentSpacesAvailable = capacity;
    }

    // all args constructor
    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        Description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
        currentSpacesAvailable = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
