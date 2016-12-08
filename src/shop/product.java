/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *
 * @author rajesh
 */
public class product implements assortment {

    String av;
    String prod;
    @Override
    public String CreateProduct(String pName, double pValue, boolean availability) {
        
        if(availability==true)
        {
             av = "Yes";
        }
        else
        {
            av = "No";
        }
        prod = "Product Name : "+pName+"\nProduct Value :"+pValue+"$"+"\nAvailability :"+av;
        return prod;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
