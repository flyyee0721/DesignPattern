package jianye.designpattern.singleton;

/**
 * Created by jianye on 3/14/17.
 */
public class MySingleton {

    private static MySingleton instance;

    private int count = 0;

    private MySingleton() { }

    public static MySingleton getInstance() {
        if (null == instance) {
            System.out.println("Initialize the instance.");
            instance = new MySingleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("I am a singleton class");
    }

    public void increase() {
        count++;
    }

    public void decrease() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
