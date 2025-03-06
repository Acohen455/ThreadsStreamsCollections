package com.revature;


//implement runnable to create a custom thread
public class CustomThread implements Runnable{

    //the run() method defines what a thread does when it is started
    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name + " is starting!");
        //we'll run through a for loop and print a message
        //basically displaying threads racing
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " is on iteration " + i);
        }
        //TODO: maybe make the threads sleep

    }
}
