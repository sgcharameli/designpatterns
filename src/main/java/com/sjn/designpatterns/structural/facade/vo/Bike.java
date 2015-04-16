
package com.sjn.designpatterns.structural.facade.vo;

public class Bike {
     
     private final String modelo;

     public Bike(String modelo) {
          this.modelo = modelo;
     }

     public String getModelo() {
          return modelo;
     }

     @Override
     public String toString() {
          return modelo;
     }
}
