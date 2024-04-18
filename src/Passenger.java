import java.util.ArrayList;
import java.util.List;
// passenger has a name, passenger number, passengerType, balance, activities
public interface Passenger{

    public String getName();

    public void setName(String name);
    public int getPassengerNo();
    public void setPassengerNo(int passengerNo);
    public PassengerType getPassengerType();
    public List<Activity> getActivities();
    public void setActivities(List<Activity> activities);
    public double getBalance();
    public void setBalance(double balance);
    public void signUpForActivity(Activity activity);
    public void setDestination(Destination destination);
    public Destination getDestination();



//    private String name;
//    private int passengerNo;
//    private PassengerType passengerType;
//    private List<Activity> activities;
//
//    public Passenger(String name, int passengerNo, PassengerType passengerType) {
//        this.name = name;
//        this.passengerNo = passengerNo;
//        this.passengerType = passengerType;
//        this.activities = new ArrayList<>();
//    }
//
//    public Passenger(String name) {
//        this.name = name;
//    }
//
//    public Passenger(String name, int passengerNo) {
//        this.name = name;
//        this.passengerNo = passengerNo;
//    }
//
//    public Passenger() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPassengerNo() {
//        return passengerNo;
//    }
//
//    public void setPassengerNo(int passengerNo) {
//        this.passengerNo = passengerNo;
//    }
//
//    public PassengerType getPassengerType() {
//        return passengerType;
//    }
//
//    public void setPassengerType(PassengerType passengerType) {
//        this.passengerType = passengerType;
//    }
//
//    public List<Activity> getActivities() {
//        return activities;
//    }
//
//    public void setActivities(List<Activity> activities) {
//        this.activities = activities;
//    }
}
