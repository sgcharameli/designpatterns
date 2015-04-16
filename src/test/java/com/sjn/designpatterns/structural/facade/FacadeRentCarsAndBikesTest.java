
package com.sjn.designpatterns.structural.facade;

import com.sjn.designpatterns.structural.facade.util.VehiclesPrinter;
import com.sjn.designpatterns.structural.facade.vo.Bike;
import com.sjn.designpatterns.structural.facade.vo.Car;
import java.util.Date;
import java.util.List;
import org.junit.Test;

public class FacadeRentCarsAndBikesTest {
     
     public FacadeRentCarsAndBikesTest() {
     }

     @Test
     public void testGetCarsAndBikesForRentFacade() {
          
          System.out.println("testGetCarsAndBikesForRentFacade:");
          FacadeRentCarsAndBikes facadeRentCarsAndBikes = new FacadeRentCarsAndBikes();
          facadeRentCarsAndBikes.getCarsAndBikesForRent(new Date(), new Date());
     }
     
     @Test
     public void testGetCarsAndBikesForRentInsteadOfFacade() {

          System.out.println("testGetCarsAndBikesForRentInsteadOfFacade:");
          
          RentCar rentCar = new RentCar();
          List<Car> cars = rentCar.getCarsFor(new Date(), new Date());
          VehiclesPrinter.printVehiclesForRent("Cars", cars);
          
          RentBike rentBike = new RentBike();
          List<Bike> bikes = rentBike.getBikesFor(new Date(), new Date());
          VehiclesPrinter.printVehiclesForRent("Bikes", bikes);
     }
     
}
