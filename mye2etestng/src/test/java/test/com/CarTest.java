/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author MARYA
 */
public class CarTest {
    Car car;
    public CarTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        car = new Car();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void validateModel(){
        car.setModel("sedan");
        car.setMake("Chrysler");
        car.setPrice(22000);
        car.setColor("silver");
        
        assertEquals("sedan", car.getModel());
        assertEquals("Chrysler", car.getMake());
        assertEquals(22000.0, car.getPrice());
        assertEquals("silver", car.getColor());
        
    }
    
}
