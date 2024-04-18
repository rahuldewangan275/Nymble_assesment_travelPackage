public class Adding{

    public void addingActivityToDestination(Destination destination, Activity activity){
        destination.getActivities().add(activity);
        activity.setDestination(destination);
    }

    public void addPassengerToDestination(Destination destination, Passenger passenger){
        if(destination==null || passenger==null){
            System.out.println("Invalid models");
            return;
        }
    destination.getPassengers().add(passenger);
    destination.getTravelPackage().getPassengers().add(passenger);
    passenger.setDestination(destination);
        System.out.println("passenger no: ["+ passenger.getPassengerNo()+"] booked ticket for destination->"+ destination.getName());


    }

    public void addDestinationToTravelPackage(TravelPackage travelPackage, Destination destination){
         destination.setTravelPackage(travelPackage);
         travelPackage.getItinerary().add(destination);
    }

    public void addActivityToPassenger(Passenger passenger, Activity activity){
        passenger.signUpForActivity(activity);
        activity.getPassengers().add(passenger);
    }


}
