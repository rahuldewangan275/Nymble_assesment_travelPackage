import java.util.ArrayList;
import java.util.List;

public class StandardPassenger implements Passenger{
    private String name;
    private int passengerNo;
    private PassengerType passengerType;
    private List<Activity> activities;
    private double balance;

    private Destination destination;

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public StandardPassenger(String name, int passengerNo, PassengerType passengerType, List<Activity> activities, double balance) {
        this.name = name;
        this.passengerNo = passengerNo;
        this.passengerType = passengerType;
        this.activities = activities;
        this.balance = balance;
        destination = null;
    }
    public StandardPassenger(String name, int passengerNo, double balance) {
        this.name = name;
        this.passengerNo = passengerNo;
        this.balance = balance;
        this.passengerType = PassengerType.STANDARD;
        this.activities = new ArrayList<>();
        destination=null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerNo() {
        return passengerNo;
    }

    public void setPassengerNo(int passengerNo) {
        this.passengerNo = passengerNo;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void signUpForActivity(Activity activity){
        double cost = activity.getCost(); //cost of activity
        if(activity.currentSpacesAvailable>=1 && balance>=cost){
            setBalance(balance-cost);
            activity.setCurrentSpacesAvailable(activity.getCurrentSpacesAvailable()-1);
            activities.add(activity);
            System.out.println("user name: "+getName()+" successfully signed up for activity: "+activity.getName());
        }else if(balance<cost){
            System.out.println("Insufficient Balance");
        }else{
            System.out.println("Seats not available");
        }
    }
}
