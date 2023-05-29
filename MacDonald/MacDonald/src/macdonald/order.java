/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macdonald;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class order extends menu{

    double totalprice=0;
    double totalpoints=0;
    
    public order(String name, double price, double points) {
        super(name, price, points);
    }

    public order() {
    }
    
    public double calcPrice(){
        for(i = 0; i < add_price.length; i++){
            totalprice+=add_price[i];
        }
        return totalprice;
    }
    
    public double calcPoints(int n, account[] a){        
        for( i = 0; i < add_points.length; i++){
           totalpoints += add_points[i];
        }     
        totalpoints+=a[n].points;
        return totalpoints;
    }  
  
    public void confirm(int index, menu[] m){
      
        for( i = 0; i< count; i++){
            if(add_name[i] == null){
                add_name[i] = m[index].name;
                add_price[i] = m[index].price;
            }
        }
    }
    
    public void display_order(int h,int m){
        for( i = 0; i < count; i++){
            k= "-" + add_name[i]+" :         "+ add_price[i] + "LE\n" ;
            w+= k;
        }
        JOptionPane.showMessageDialog(null,"""
                                                      ***Your order***
                                                        Time : """ + h + ":" + m + "\n" 
                + "--------------------------------------\n" + w + "______________________" 
                + "\n Total Price : " + calcPrice() +"0LE \n" + "\n Thank You......." );        
    }

    @Override//
    public int choose(menu[] m) {
        for( i = 0; i<m.length; i++){     
          if((q-1) == i){
              n = i;
              count ++;     
           }
        }
        return n ;
    }
}