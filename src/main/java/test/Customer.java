/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import test.DiscountType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Yunas
 */
@Entity
public class Customer {
    @Id
    String customer;
    
    
    
    
    @OneToOne(mappedBy = "customer")
    private DiscountType DisT;
    
    
    
   


    
}
