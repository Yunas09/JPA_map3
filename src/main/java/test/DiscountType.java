/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import test.DiscountQuantity;
import test.DiscountFixed;

/**
 *
 * @author Yunas
 */
 @Inheritance
public class DiscountType {

    @Id
    private Long id;

    @OneToMany(mappedBy = "DisT")
    private Customer customer;

   
    
 
    public static void main(String[] args) {
        DiscountQuantity dq = new DiscountQuantity();
        DiscountFixed df = new DiscountFixed();
        System.out.println(df.calcDiscount(20, 200));
        System.out.println(dq.calcDiscount(2, 10));
        
    }
   
    
 
        
        
        
        
    
    
}
