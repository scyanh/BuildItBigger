package com.example.ashpro.myapplication.backend;

import com.example.SayJoke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;
    private SayJoke sayJoke;

    public MyBean(){
        sayJoke=new SayJoke();
    }

    public String getData() {
        //myData=sayJoke.getRandomJoke();
        return myData;
    }


    public void setData(String data) {
        myData = sayJoke.getRandomJoke();
    }
}