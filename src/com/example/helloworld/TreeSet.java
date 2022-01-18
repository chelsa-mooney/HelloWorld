package com.example.helloworld;

import java.util.PriorityQueue;

public class TreeSet {

    public static void main(String args[]){
        PriorityQueue<String> pqe = new PriorityQueue<String>();

            pqe.add("m&ms");
            pqe.add("smarties");
            pqe.add("kit kats");
            pqe.add("butterfingers");
            pqe.add("reeces cups");

            //Print the queue
            System.out.println("All candies " + pqe);

            //Print the first element in th queue
            System.out.println("First candy: " +pqe.peek());

            //Retrieve and remove head of queue
            System.out.println("Remove first sweet: " + pqe.poll());

            //Print the queue again
            System.out.println("All elements, updated " +pqe);
    }
}
