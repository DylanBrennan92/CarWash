/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carwash;

/**
 *
 * @author dylan
 */
public class Vehicle {
    String vehicle;
    String reg;
    String washType;

    public Vehicle(String vehicle, String reg, String washType) {
        this.vehicle = vehicle;
        this.reg = reg;
        this.washType = washType;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getReg() {
        return reg;
    }

    public String getWashType() {
        return washType;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public void setWashType(String washType) {
        this.washType = washType;
    }
    
    
}
