
package com.sjn.designpatterns.structural.facade;

import com.sjn.designpatterns.structural.facade.vo.Bike;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentBike {
     
     public List<Bike> getBikesFor(Date from, Date to){
          List<Bike> bikeList = new ArrayList<>();
          bikeList.add(new Bike("Vespinillo"));
          bikeList.add(new Bike("CBR 650"));
          
          return bikeList;
     }

}
