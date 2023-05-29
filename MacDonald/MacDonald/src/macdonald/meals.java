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
public class meals extends menu{
    
    String description;
    
    public meals(String name, String description,double price, double points) {
        super(name, price, points);
        this.description= description;
    }

    public meals() {
    }

    public int display(meals[] M){
                
       for( i = 0; i < M.length; i++){
            k=(i+1)  + "-" + M[i].name+ "\n" + M[i].description + "\n";
            w+= k;
        }
        i+=1;
        q= Integer.parseInt(JOptionPane.showInputDialog( null ,"***Enter no. of item***\n" + w + i + "-Go Back"));
        w="";
        return 0;
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