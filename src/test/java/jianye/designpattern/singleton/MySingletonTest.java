package jianye.designpattern.singleton;

import static org.junit.Assert.*;

/**
 * Created by jianye on 3/14/17.
 */
public class MySingletonTest {

    MySingleton mySingleton;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void getInstance() throws Exception {
        MySingleton first = MySingleton.getInstance();
        first.print();
        MySingleton second = MySingleton.getInstance();
        second.print();
        System.out.println(first);
        System.out.println(second);
        System.out.println("Count from first is " + first.getCount());
        first.increase();
        System.out.println("Count from first is " + first.getCount());
        System.out.println("Count from second is " + second.getCount());
    }

    @org.junit.Test
    public void print() throws Exception {

    }

}