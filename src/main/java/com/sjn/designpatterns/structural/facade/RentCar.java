
package com.sjn.designpatterns.structural.facade;

import com.sjn.designpatterns.structural.facade.vo.Car;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentCar {
     
     public List<Car> getCarsFor(Date from, Date to){
          List<Car> carList = new ArrayList<>();
          carList.add(new Car("Avensis"));
          carList.add(new Car("Xsara"));
          carList.add(new Car("C15"));
          
          return carList;
     }

}
