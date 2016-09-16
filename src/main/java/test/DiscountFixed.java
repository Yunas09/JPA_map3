/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Yunas
 */
@Entity
public class DiscountFixed {
    
    @Id
    double discount = 0.1; //10% on all

    public double calcDiscount(double priceItem, int quantity) {
        return priceItem * discount * quantity;

    }
}
