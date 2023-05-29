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
public class drink extends menu{
    
    public drink(String name, double price, double points) {
        super(name, price, points);
    }

    public drink() {
    }
    public int display(drink[] dri){
        
       for( i = 0; i<dri.length; i++){
            k=(i+1)  + "-" + dri[i].name+ "\n";
            w+= k;
        }
        i+=1;       
        q= Integer.parseInt(JOptionPane.showInputDialog( null ,"***Enter no. of item you want***\n" + w + i + "-Go Back"));
        w="";
        return 0;
    }
    
    @Override
    public int choose(menu[] m){

        for( i = 0; i<m.length; i++){     
          if((q-1) == i){
              n = i;
              count ++;     
           }
        }
        return n ;
    }    
}