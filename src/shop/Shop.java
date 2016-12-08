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
public class Shop {

    /**
     * @param args the command line arguments
     */
    public assortment CreateProduct(EnumTest type)
    {
     assortment nProduct = null;
     switch (type)
        {
        case cProduct :
        nProduct = new product();
        break;
        default:
        break;
        }
        return nProduct;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Shop S1 = new Shop();
        assortment [] Intf= new assortment[4];
        System.out.println("Your Mobile shope has these products : ");
        Intf[0] = S1.CreateProduct(EnumTest.cProduct);
        System.out.println("Product#1\n"+Intf[0].CreateProduct("iPhone-7",700.0, true));
        Intf[1] = S1.CreateProduct(EnumTest.cProduct);
        System.out.println("Product#2\n"+Intf[1].CreateProduct("Samsung Galaxy S6", 650.0, false));
        Intf[2] = S1.CreateProduct(EnumTest.cProduct);
        System.out.println("Product#3\n"+Intf[2].CreateProduct("Samsung Galaxy S7", 750.0, true));
        Intf[3] = S1.CreateProduct(EnumTest.cProduct);
        System.out.println("Product#4\n"+Intf[3].CreateProduct("iPhone-6s", 640.0, true));
    }
    
}
