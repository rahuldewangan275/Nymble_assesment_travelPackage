import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

         TravelPackage travelPackage = new TravelPackage("World Tour");
         travelPackage.setPassengerCapacity(20);

        // creating sestinations
        Destination destination1 = new Destination("Rio de Jenerio",travelPackage);
        Destination destination2 = new Destination("Thailand",travelPackage);
        Destination destination3 = new Destination("Japan",travelPackage);

        travelPackage.getItinerary().add(destination1);
        travelPackage.getItinerary().add(destination2);
        travelPackage.getItinerary().add(destination3);

        //creating Activities
        Activity activity1 = new Activity("Bird show","this is the famous bird show celebrated every year in Rio-de-jenerio",1500,5);
        Activity activity2 = new Activity("Dolphin show", "Famous dolphin show",4000,1);
        Activity activity3 = new Activity("Thai Massage","Famous thai massage by experts in Thailan",1200,5);
        Activity activity4 = new Activity("Gadget Show","famous future gadgets show in Japan",1400,2);


        //creating Passengers
        Passenger passenger1 = new PremiumPassenger("Ekant",1); // premium passenger no balance required
        Passenger passenger2 = new PremiumPassenger("Kunal",2); //premium passenger no balance required
        Passenger passenger3 = new GoldPassenger("Sonu",3,4000);
        Passenger passenger4 = new StandardPassenger("Rahul",4,3000);

        //assigning activity to passenger

        Adding adding = new Adding();
        // adding acitvities to the destination
        adding.addingActivityToDestination(destination1,activity1);
        adding.addingActivityToDestination(destination1,activity2);
        adding.addingActivityToDestination(destination2,activity3);
        adding.addingActivityToDestination(destination3,activity4);
        // adding passenger to destination
        adding.addPassengerToDestination(destination1,passenger1);
        adding.addPassengerToDestination(destination1,passenger2);
        adding.addPassengerToDestination(destination2,passenger3);
        adding.addPassengerToDestination(destination3,passenger4);
        System.out.println();

        // adding activity for passenger
        adding.addActivityToPassenger(passenger1,activity1);
        adding.addActivityToPassenger(passenger1,activity2);
        adding.addActivityToPassenger(passenger2,activity1);
        adding.addActivityToPassenger(passenger3,activity3);
        adding.addActivityToPassenger(passenger4,activity4);




         // printing machine
        PrinterClass printer = new PrinterClass();
        System.out.println();

//1.      Print itinerary of the travel package including:
        printer.printDestinations(travelPackage);
        System.out.println();
// 2.       Print the passenger list of the travel package including:
         printer.printPassengerList(travelPackage);
        System.out.println();
//3.     Print the details of an individual passenger including their
        printer.printDetailsOfAllPassengers(travelPackage.getPassengers());
        System.out.println();
//4.     Print the details of all the activities that still have spaces available, including how many spaces are available.
        printer.printAvailableActivities(travelPackage);
//
        printer.printDestinations(travelPackage);









    }
}