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
public class dessert extends menu{

    public dessert(String name, double price, double points) {
        super(name, price, points);
    }
    
    public dessert(){
    }
    
    public int display(dessert[] dd) {
               
        for( i = 0; i<dd.length; i++){
            k=(i+1)  + "-" + dd[i].name+ "\n";
            w+= k;
        }
        i+=1;
        q= Integer.parseInt(JOptionPane.showInputDialog( null ,"***Enter no. of item***\n" + w + i + "-Go Back"));  
        w="";
        return q;
    }
    
    @Override
     public int choose(menu[] m){
   
        int n =0;

        for( i = 0; i<m.length; i++){
            if((q-1) == i){
              n = i;
              count ++;
            }
        }
        return n ;
    }
}