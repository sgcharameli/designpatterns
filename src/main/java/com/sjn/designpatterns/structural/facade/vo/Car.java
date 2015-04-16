
package com.sjn.designpatterns.structural.facade.vo;

public class Car {
     
     private final String modelo;

     public Car(String modelo) {
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
