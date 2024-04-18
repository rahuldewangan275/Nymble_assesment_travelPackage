import java.util.ArrayList;
import java.util.List;
//Each travel package has a name, a passenger capacity, an itinerary
// (list of destinations) and a list of it's passengers
public class TravelPackage {
   private String name;
   private int passengerCapacity;
   private List<Destination> itinerary;
   private List<Passenger>passengers;
   private int enrolledPassengers;

    public int getEnrolledPassengers() {
        return enrolledPassengers;
    }

    public TravelPackage(String name, int passengerCapacity, List<Destination> itinerary, List<Passenger> passengers, int enrolledPassengers) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = passengers;
        this.enrolledPassengers = enrolledPassengers;
    }

    public void setEnrolledPassengers(int enrolledPassengers) {
        this.enrolledPassengers = enrolledPassengers;
    }

    //all args constructor
    public TravelPackage(String name, int passengerCapacity, List<Destination> itinerary, List<Passenger> passengers) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = itinerary;
        this.passengers = passengers;
    }

    public TravelPackage(String name) {
        this.name = name;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.passengerCapacity =0;
    }

    // all getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public void setItinerary(List<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
