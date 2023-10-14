/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author kuldeep
 */


// A class that implements the Drivable interface
public class Car implements Drivable {
    private float speed;
    private float direction;
    private String make;
    private String type;

    public Car(String make, String type) {
        this.make = make;
        this.type = type;
        this.speed = 0;
        this.direction = 0;
    }

    @Override
    public void accelerate(float speed) {
        this.speed += speed;
    }

    @Override
    public void brake() {
        this.speed = 0;
    }

    @Override
    public void turn(float angle) {
        this.direction += angle;
    }

    @Override
    public float getDirection() {
        return direction;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }

    
}

public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Instantiate an object of the Car class
        Car myCar = new Car("Toyota", "Sedan");
        
        // Use the Drivable methods to control the car
        myCar.accelerate(50);
        myCar.turn(45);
        
        // Print some information about the car
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Type: " + myCar.getType());
        System.out.println("Speed: " + myCar.getSpeed());
        System.out.println("Direction: " + myCar.getDirection());
    }
    
}
