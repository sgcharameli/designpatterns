
package com.sjn.designpatterns.structural.facade.util;

import java.util.List;

public class VehiclesPrinter {
     
     public static void printVehiclesForRent(String vehicleType, List vehicleList){          
          
          System.out.println("===========================================");
          System.out.println(vehicleType +" available for Rent: ");
          for (Object vehicle : vehicleList){
               System.out.print(vehicle + " ");
          }
          System.out.println("");
          System.out.println("===========================================");
     }
}
