package com.company;

import com.company.bardy.Bardy;
import com.company.person.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // HINT
// public class Bardy extends Car
// Assuming we had a car brand, called Bardy.
// Create an object of this class, and make it extend another class called Car.
// class Car features include: noOfTires, color.

// Create another class called Person.
// Features of person include: name, age, likeBardy, hasBardy, bardiesOwned(ArrayList)

// In the main method, create a list that will contain a number of people.
// And if a person likes bardy and does not have bardy, then give them a Bardy.

      /*  List<Bardy> lotteryBardies = new ArrayList<>();
        lotteryBardies.add(new Bardy(4, "black", 4, false));
        lotteryBardies.add(new Bardy(4, "red", 4, false));
        lotteryBardies.add(new Bardy(4, "orange", 2, true));
        lotteryBardies.add(new Bardy(4, "yellow", 4, false));
        lotteryBardies.add(new Bardy(4, "blue", 2, true));


        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Fred", 34, true, true));
        personList.add(new Person("Wilma", 20, true, false));
        personList.add(new Person("Shaggy", 28, false, false));
        personList.add(new Person("Carly", 29, false, false));
        personList.add(new Person("Dan", 30, true, false));

        // loop through and if you encounter a person who likes bardy and doesn't have then give them a random bardy
        // from the list above.

        for (Person person : personList) {
            List<Bardy> bardiesOwned = new ArrayList<>();

            if (person.isLikeBardy() && person.isHasBardy()) {
                // If the person likes bardy and has a bardy
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setBardiesOwned(bardiesOwned);
            } else if (person.isLikeBardy() && !person.isHasBardy()) {
                // if the person likes bardy and does not have a bardy.
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setHasBardy(true);
                person.setBardiesOwned(bardiesOwned);
            }
        }

        for (Person person : personList) {
            if (person.isLikeBardy() && person.isHasBardy()) {
                System.out.println(person.getName() + " has this " + person.getBardiesOwned().get(0).getColor() + " bardy");
            }
        }
*/



        /*// Queue
        // A queue is a collection interface that allows us to implement FIFO and LIFO.
        // FIFO - First-In-First-Out.
        // LIFO - Last-In-First-Out.
        Queue<String> names = new LinkedList<>();
        Queue<String> people = new LinkedList<>();
        names.offer("Josh");
        names.offer("Harry");
        names.offer("David");
        names.offer("George");
        System.out.println(names.element()); // returns an element from the front of the queue
        System.out.println(people.peek()); // does the same thing as the element() method but doesn't throw
        // an error on an empty queue.

        names.remove(); // removes an item from the front of the queue.
        names.poll(); // poll does the same thing as the remove method, except it doesn't throw an error
        // when faced with an empty queue.names.offer("Josh");
*/

        // The deque is an collection interface that allows us to manipulate items to the top and
        // bottom of the deque
        /*Deque<String> names = new ArrayDeque<>();
        names.addFirst("Josh"); // offerFirst();
        names.add("Dave"); // offer();
        names.addLast("Paul"); // offerLast();

        System.out.println(names.remove());
        */


        // Maps
        // A map is a collection interface that affords us a key-value pair relationship in a data structure.

        // HashMap returns the keys in a random format doesn't really care how you entered it, and doesn't bother
        // to organise them.

        // TreeMap organises the keys in the natural ascending order. (irrespective of how they were added).
        // meaning strings are returned in alphabetic order. and numbers are returned in ascending order.

        // LinkedHashMap saves the manner in which the items are added and returns them in that particular order.

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("Nigeria", "Abuja"); // use the put() method of the Map interface to add a new item to the map.
        countries.put("USA", "Washington D.C.");
        countries.put("China", "Hong Kong");
        countries.put("Japan", "Tokyo");
        countries.put("Japan", "Georgia");


        for (String country : countries.keySet()) {
            System.out.println("The capital of " + country + " is: " + countries.get(country));
        }


        // Task: 1 - 10mins.
        // Write a program that uses a Map to uniquely categorise animals and the sounds they make.

        // Task 2: 10 mins
        // Write a program that uses a Map to uniquely categorise wild animals and the names for their kids.



    }

    public static int getRandomIndex(List<Bardy> objectList) {
//        int randomIndex = (int)(Math.random() * objectList.size()); // generate a random number.

        return (int)(Math.random() * objectList.size()); // generate a random number.

        /*if (randomIndex < objectList.size()) return randomIndex;
        else return getRandomIndex(objectList);*/
    }
}
