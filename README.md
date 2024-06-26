# Nymble Task

## Technologies used
Java

  ### clone the repository
  ```
 https://github.com/rahuldewangan275/Nymble_assesment_travelPackage
  ```

## Task 
Design, implement and test a software system that allows travel agencies to maintain their travel packages' itinerary and passengers.

## Specification
1. Each travel package has a name, a passenger capacity, an itinerary (list of destinations) and a list of it's passenger.
2. Each destination has a name, and a list of the activities available at that destination.
3. Each activity has a name, a description, a cost and a capacity. Each activity is available at one destination only. 
4. Each passenger can sign up for zero or more activity at each destination of the travel package.
5. Once an activity has reached it's capacity no more passengers can sign up for it.
6. Each passenger has a name and a passenger number. 
7. A passenger can be a standard, gold or premium passenger. 
    1. A standard passenger has a balance. And each time a standard passenger signs up for an activity the cost is deducted from their balance. They cannot sign up for an activity if they do not have sufficient balance.
    2. A gold passenger has a balance. Each time a gold passenger signs up for an activity, a 10% discount is applied on the cost of the activity and the discounted amount is deducted from their balance. They cannot sign up for an activity if they do not have sufficient balance.
    3. A premium passenger can sign up for activities for free.
    

In addition to the above specifications, the classes should provide the following functions:

1. Print itinerary of the travel package including: 
    1. travel package name, 
    2. destinations and details of the activities available at each destination, like name, cost, capacity and description.
2. Print the passenger list of the travel package including: 
    1. package name, 
    2. passenger capacity, 
    3. number of passengers currently enrolled and 
    4. name and number of each passenger
3. Print the details of an individual passenger including their 
    1. name, 
    2. passenger number, 
    3. balance (if applicable), 
    4. list of each activity they have signed up for, including the destination the at which the activity is taking place and the price the passenger paid for the activity.
4. Print the details of all the activities that still have spaces available, including how many spaces are available.

##  Guidelines

The code should adhere to the following guidelines.

1. Each class should follow the [SOLID Design Principles](https://itnext.io/solid-principles-explanation-and-examples-715b975dcad4).
2. [Clean Code Guidelines](https://gist.github.com/wojteklu/73c6914cc446146b8b533c0988cf8d29) should be kept in mind while writing the code (Dependency Injection can be skipped)
3. [Unit Test guidelines](http://kblaney.squarespace.com/junit-best-practices/) should be followed. 
4. [Java code documentation](https://www.tutorialspoint.com/java/java_documentation.htm) needs to be done properly.
5. 
### Note: main method contina all the pre written testing codes
