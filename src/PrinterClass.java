import java.util.List;

public class PrinterClass {

    public PrinterClass(){

    }

    public void printDestinations(TravelPackage travelPackage){
        // print travel package name & destinations with details of activities
        System.out.println();
        System.out.println("## Detailed List Of All  Destinations ##");
        System.out.println("#Travel Package Name : " + travelPackage.getName());
        // list of destinations
        List<Destination> destinationList = travelPackage.getItinerary();

        int c=1;
        System.out.println();
        for(Destination destination : destinationList){
            System.out.println( c+"*Destination Name: "+ destination.getName() );
            c++;
            printActivityDetail(destination.getActivities());
        }
    }

    public void printActivityDetail(List<Activity> activities){
        int c =1;
        System.out.println("Activity Details: Activities Available here: ");
        for(Activity activity: activities){
            System.out.println("<" + c++ +">Activity ");
            System.out.println("Name: "+activity.getName());
            System.out.println("Cost: "+activity.getCost());
            System.out.println("Available seats: "+activity.getCapacity());
            System.out.println("Description: "+activity.getDescription());
        }
        System.out.println();
    }

    //print passenger list from travel package
    public void printPassengerList(TravelPackage travelPackage){
        List<Passenger> passengerList = travelPackage.getPassengers();
        System.out.println("## Printing Passengers List: ## ");
        System.out.println("Package Name: "+travelPackage.getName());
        System.out.println("Passenger Capacity: "+travelPackage.getPassengerCapacity());
        System.out.println("No of passenger currently Enrolled: "+travelPackage.getPassengers().size());
        System.out.println("Below is the passenger list:-");
        printPassengerList(travelPackage.getPassengers());
    }

    public void printPassengerList(List<Passenger>passengers){
        for(Passenger passenger: passengers){
            System.out.println("No: "+ passenger.getPassengerNo() +"  Name: "+passenger.getName());
        }
    }

    public void printDetailsOfAllPassengers(List<Passenger> passengers){

        if(passengers.size()>0){
            System.out.println("## Printing the details of All the Passengers ##");
        }else{
            System.out.println("No Passengers available");
        }

        for(Passenger passenger : passengers){
            System.out.println();
            System.out.println("Passenger Name: "+passenger.getName());
            System.out.println("Passenger No: "+passenger.getPassengerNo());
            if(passenger.getPassengerType()==PassengerType.PREMIUM){
                System.out.println("Balance :  Not Applicable for Premium Passengers");
            }else System.out.println("Balance: "+passenger.getBalance());

            System.out.println("List of Activities Signed Up by Passenger Name: "+passenger.getName()+ " find below: " );
            printActivityDetailsForPassenger(passenger.getActivities(),passenger.getPassengerType());
        }

    }

    public void printActivityDetailsForPassenger(List<Activity>activities,PassengerType passengerType){
        int cnt=1;
        if(activities.size()==0){
            System.out.println("not Activities is Signesd up by Passenger");
        }
        for(Activity activity : activities){
            //print all details

            System.out.println("("+ cnt++ + ") Activity Name: "+ activity.getName());
            System.out.println("Activity Available at Destination : "+ activity.getDestination().getName());
            double pricePaid =0;
            if(passengerType == PassengerType.PREMIUM){
                pricePaid =0;
            }else if(passengerType == PassengerType.GOLD){
                pricePaid = 0.9* activity.getCost();
            }
            System.out.println("price paid: "+pricePaid);
        }
    }

    public void printAvailableActivities(TravelPackage travelPackage){
        System.out.println("## Printing Activities Available ##");
        boolean t=false;
        for(Destination destination: travelPackage.getItinerary()){
            for(Activity activity: destination.getActivities()){
                if(activity.getCurrentSpacesAvailable()==0){
                    continue;
                }
                System.out.println("Activities Available" + " At Destination name: "+activity.getDestination().getName());
                if(activity.getCurrentSpacesAvailable()>=1){
                    t=true;
                    System.out.println("name:"+ activity.getName());
                    System.out.println("cost :"+activity.getCost());
                    System.out.println("Spaces Available :"+ activity.getCurrentSpacesAvailable());
                }
            }
        }
        if(!t){
            System.out.println("No Activities Available");
        }
    }
}
