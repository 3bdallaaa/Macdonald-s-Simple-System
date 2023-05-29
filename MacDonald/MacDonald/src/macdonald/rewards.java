/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macdonald;

import javax.swing.JOptionPane;

/**
 *
 * @author Microsoft
 */
public class rewards extends menu{
    
    String description;
    int point;

    public rewards(String description, int point) {
        this.description = description;
        this.point = point;
    }

    public rewards(){
    }

    public void display_rewards(double TP, rewards[] r){
        for( i =0; i<r.length; i++){
            if(r[i].point <= TP){
                k="\n" + (i+1)  + "- " +r[i].description + ": " + r[i].point ;
                w+=k;
            }
        }
        q = Integer.parseInt(JOptionPane.showInputDialog( null ," Your Points : " + TP + w));
        w=r[q-1].description;
        TP-=r[q-1].point;
        JOptionPane.showMessageDialog(null,"           Congratulations \n                You won\n -" + w + "\n Your points =" + TP);
    }
    @Override//
    public int choose(menu[] m) {
        for( i = 0; i<m.length; i++){     
          if((q-1) == i){
              n = i;
              count ++;     
           }
        }
        return n ;    }
}