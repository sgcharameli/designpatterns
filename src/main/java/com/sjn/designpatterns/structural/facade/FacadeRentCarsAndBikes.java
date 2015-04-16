
package com.sjn.designpatterns.structural.facade;

import com.sjn.designpatterns.structural.facade.util.VehiclesPrinter;
import com.sjn.designpatterns.structural.facade.vo.Bike;
import com.sjn.designpatterns.structural.facade.vo.Car;
import java.util.Date;
import java.util.List;

public class FacadeRentCarsAndBikes {
     
     private RentCar rentCar;
     private RentBike rentBike;
     
     public FacadeRentCarsAndBikes(){
          this.rentCar = new RentCar();
          this.rentBike = new RentBike();
     }
     
     public void getCarsAndBikesForRent(Date from, Date to){
          
          List<Car> carsForRent = rentCar.getCarsFor(from, to);
          List<Bike> bikesForRent = rentBike.getBikesFor(from, to);
          
          printCarsAndBikesForRent(carsForRent, bikesForRent);
     }

     private void printCarsAndBikesForRent(List<Car> carsForRent, List<Bike> bikesForRent) {
          
          VehiclesPrinter.printVehiclesForRent("Cars", carsForRent);
          VehiclesPrinter.printVehiclesForRent("Bikes", bikesForRent);
     }
     
}
