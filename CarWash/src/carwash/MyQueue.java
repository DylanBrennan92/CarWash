/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwash;

import java.util.ArrayList;

/**
 *
 * @author dylan
 */
public class MyQueue {

    //Selecting a queue ADT as queues are an Abstract data type which work based on the first in first out principle (FIFO)
    private ArrayList<Vehicle> theQueue;

    public MyQueue() {
        theQueue = new ArrayList<>();
    }

    public int size() {
        return theQueue.size();
    }

    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    public Vehicle frontElement() {
        if (!(theQueue.isEmpty())) {
            return theQueue.get(0);
        } else {
            return null;
        }
    }

    public void enqueue(Object newItem) {
        theQueue.add((Vehicle) (newItem));
    }

    public Vehicle dequeue() {
        if (!(theQueue.isEmpty())) {
            return theQueue.remove(0);
        } else {
            return null;
        }
    }

}//end of myQueue class
