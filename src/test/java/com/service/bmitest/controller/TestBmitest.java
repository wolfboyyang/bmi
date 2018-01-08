package com.service.bmitest.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestBmitest {

        BmitestDelegate bmitestDelegate = new BmitestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = bmitestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}