import java.util.ArrayList;
import java.util.List;

public class PremiumPassenger implements Passenger{
    private String name;
    private int passengerNo;
    private PassengerType passengerType;
    private List<Activity> activities;
    private Destination destination;

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public PremiumPassenger(String name, int passengerNo, PassengerType passengerType, List<Activity> activities) {
        this.name = name;
        this.passengerNo = passengerNo;
        this.passengerType = passengerType;
        this.activities = activities;
        destination = null;
    }

    public PremiumPassenger(String name, int passengerNo) {
        this.name = name;
        this.passengerNo = passengerNo;
        this.passengerType = PassengerType.PREMIUM;
        this.activities = new ArrayList<>();
        destination = null;
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

    @Override
    public double getBalance() {
        System.out.println("Not Available");
        return 0;
    }

    @Override
    public void setBalance(double balance) {
        System.out.println("Not Available");
    }

    public void signUpForActivity(Activity activity){
        //10% instant Discount
        if(activity.getCurrentSpacesAvailable()>=1){
            activity.setCurrentSpacesAvailable(activity.getCurrentSpacesAvailable()-1);
            activities.add(activity);

            System.out.println("user name: "+getName()+" successfully signed up for activity: "+activity.getName());
        }else{
            System.out.println("Seats Not Available");
        }
        System.out.println();
    }
}
