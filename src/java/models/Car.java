/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author placideh
 */
public class Car implements Serializable {
    private static final long serialVersionUID=1234L;
    private String plateNo;
    private LocalDate manufacturingDate ;
    private Long cost;
    private String institution;

    public Car(String plateNo, LocalDate manufacturingDate, Long cost, String institution) {
        this.plateNo = plateNo;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
        this.institution = institution;
    }

    public Car() {
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "Car{" + "plateNo=" + plateNo + ", manufacturingDate=" + manufacturingDate + ", cost=" + cost + ", institution=" + institution + '}';
    }
    
    
}
