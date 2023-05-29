/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package macdonald;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class MacDonald {
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) {
   
    //                    *****************************Desserts***********************************        

    dessert de = new dessert();
    dessert[] d = new dessert[7];
    
    
    d[0] = new dessert("Strawberry Custard Pie",20,10);
    d[1] = new dessert("Apple Pie",20,15);
    d[2] = new dessert("Chocolate Fudge Sundae",10,5);
    d[3] = new dessert("Caramel Sundae",10,5);
    d[4] = new dessert("Strawberry Sundae",10,5);
    d[5] = new dessert("Ice Cream Cone",15,10);
    d[6] = new dessert("Oreo McFlurry",25,15);
    
    //                     ******************************Drinks****************************************
    
    drink dr = new drink();
    drink[] drink = new drink[17];
    
    
    drink[0 ] = new drink("Chocolate Milkshake",30,20);
    drink[1 ] = new drink("Strawberry Milkshake",30,20);
    drink[2 ] = new drink("Vanilla Milkshake",30,20);
    drink[3 ] = new drink("Apple Juice",25,15);
    drink[4 ] = new drink("orange Juice",25,15);
    drink[5 ] = new drink("Coca-Cola",20,10);
    drink[6 ] = new drink("Coca-Cola Zero",20,10);
    drink[7 ] = new drink("Water",20,10);
    drink[8 ] = new drink("Sprite",20,10);
    drink[9 ] = new drink("Fanta",20,10);
    drink[10] = new drink("Green Fanta Apple",20,10);
    drink[11] = new drink("American Coffee",40,30);
    drink[12] = new drink("Expresso",40,30);
    drink[13] = new drink("Cappucino",40,30);
    drink[14] = new drink("HOT Chocolate",35,25);
    drink[15] = new drink("Latte",40,30);
    drink[16] = new drink("Hot Tea",30,20);
    
    //                  *********************************Food******************************************
    
    food f = new food();
    food[] fo = new food[12];
    
    fo[0] = new food("Big Mac",60,55);
    fo[1] = new food("Big Tasty",75,70);
    fo[2] = new food("Double Big Tasty",80,75);
    fo[3] = new food("Cheeseburger",60,55);
    fo[4] = new food("Double Cheeseburger",80,75);
    fo[5] = new food("McChicken",70,65);
    fo[6] = new food("Big Tasty Chicken",75,70);
    fo[7] = new food("Grand Chicken Premier",65,60);
    fo[8] = new food("Grand Chicken Spicy",65,60);
    fo[9] = new food("Chicken Fillet",55,50);
    fo[10] = new food("Spicy Chicken Fillet",55,50);
    fo[11] = new food("Chicken MACDO",45,40);
       
    //             ************************************Breakfast***************************************
    
    breakfast  b = new breakfast();
    breakfast[] br = new breakfast[5];
    
    br[0] = new breakfast("McFalafel",20,15);
    br[1] = new breakfast("Chicken McMuffin",30,25);
    br[2] = new breakfast("Sausage McMuffin",25,20);
    br[3] = new breakfast("Egg & Cheese Wrap",15,10);
    br[4] = new breakfast("Hotcakes 2 Pieces",15,10);
    
    //              **************************************Meals******************************************

    meals m = new meals();
    meals[] me = new meals[3];
    
    me[0] = new meals("Mix 2 Meal", """
                                       Pick two! Choose among the tasty Cheeseburger, the 
                                       delicious Chicken MACDO or the juicy Beefburger + 
                                       Fries + Drink.""",130,120);
    me[1] = new meals("Share Box", """
                                      Share and enjoy our iconic items at a great price! Pick 2 
                                      sandwiches from Big Mac (Beef/Chicken) and 
                                      McChicken + 2 sandwiches from Beef Burger, 
                                      Cheeseburger and Chicken MacDo + 2 regular Fries + 
                                      1.25 liter Coke.""",145,135);
    me[2] = new meals("Grand Share Box", """
                                            Share and enjoy our iconic items at a great price! Pick 2 
                                            sandwiches from the juicy Big Tasty (Beef/Chicken) 
                                            and delicious Grand Chicken (Premier, Spicy) + 2 
                                            sandwiches from Beefburger, Cheeseburger and 
                                            Chicken MACDO + 2 regular Fries + 1.25 liter Coke.""",200,190);

        //         *************************************Rewards*******************************************
    
      rewards re = new rewards();
      rewards[] r = new rewards[10];
      
      r[0] = new rewards("Free Sundae ", 10);
      r[1] = new rewards("Free MacDo", 30);
      r[2] = new rewards("Free McFizz", 30);
      r[3] = new rewards("Free McFlurry", 40);
      r[4] = new rewards("Free American Coffe", 20);
      r[5] = new rewards("Free Double Cheeseburger", 55);
      r[6] = new rewards("Free 6 McNuggets", 55);
      r[7] = new rewards("Free Happy Meal", 55);
      r[8] = new rewards("Free Big Mac", 75);
      r[9] = new rewards("Free McRoyale Meal", 140);   
        
        //         *************************************Accounts*******************************************
   
      account[] a = new account[5];
      account[] newa = new account[3];
      account User = new account();
      
      a[0] = new account("Mohamed","Abdalla","Heliopolis","admin"       ,"01122334455","adminnnn"  ,22,20 ,'m');
      a[1] = new account("Eman"   ,"EL-Kady","Sheraton"  ,"ta@aast.com" ,"01277889933","ta.aastmt" ,15,80 ,'f');
      a[2] = new account("Hesham" ,"Mohamed","Sheraton"  ,"doc@aast.com","01544668800","doc.aast"  ,45,300,'m');
      a[3] = new account("user"   ,"one"    ,"Roxy"      ,"one@aast.com","12345678910","user1.aast",20,0  ,'f');
      a[4] = new account("user"   ,"two"    ,"Maadi"     ,"two@aast.com","01004455998","user2.aast",30,50 ,'m');
    
      newa[0] = new account("new" ,"user"   ,"Zamalek"   ,"new@gmail.com","01234569998","new.user" ,19,10 ,'f');
      
      //////////////////////////////////////////
        int  minute;
        int hour;
        Calendar date = Calendar.getInstance();
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);
      //////////////////////////////////////////
      
      JOptionPane.showMessageDialog(null, "Welcome to MacDonald's \n");
      
      int again=0;
      int in=0;
      while(again==0){
            int c1 = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                        Enter your choice: 
                                                                        1) Log in 
                                                                        2) Register 
                                                                        """));
            
            if(c1 == 1){
                String email = JOptionPane.showInputDialog( null , "Enter mail:");
                String pass =JOptionPane.showInputDialog(null,"Enter password");
                in = User.check_login(email, pass, a);
                again++;
            }
            else if (c1 == 2){      
                User.Register(newa);
                again++;
            }
       }
      
      String catt="""
                                        --Menu--
                    -Choose Category: 
                  1) Meals. 
                  2) Sandwiches. 
                  3) Drinks. 
                  4) Desserts. 
                  5) Breakfast 
                  """;
      
      int cat;      
      do{
          cat = Integer.parseInt(JOptionPane.showInputDialog( null ,catt));
      }while(cat<1||cat>5);
      

      char c;
      again=0;

      order o = new order();

      while(again==0){
          switch (cat) {
              case 1 -> {
                  m.display(me);
                  o.confirm(m.choose(me), me);
                }
              case 2 -> {
                  f.display(fo);
                  o.confirm(f.choose(fo), fo);
              }
              case 3 -> {
                  dr.display(drink);
                  o.confirm(dr.choose(drink) , drink);
              }
              case 4 -> {
                  de.display(d);
                  o.confirm(de.choose(d),  d);
              }
              case 5 -> {
                  if (hour>-11)
                      JOptionPane.showMessageDialog(null, "Breakfast ends at 11:00am","Sorry", JOptionPane.WARNING_MESSAGE);
                  else{
                      b.display(br);
                      o.confirm(b.choose(br), br);
                  }
              }
              default -> {continue;
                      }
          }
          
          c = JOptionPane.showInputDialog( null ,"Add another item? (y/n)").charAt(0);   
          while (again==0){
              if(c == 'n' || c == 'N'){
                  again=1;
                  break;
               }
              if (c == 'y' || c == 'Y'){
                  cat = Integer.parseInt(JOptionPane.showInputDialog( null ,catt));
                  break;
               }
              else{
                  JOptionPane.showMessageDialog(null,"Invalid entry \n","Invalid", JOptionPane.WARNING_MESSAGE);
                  break;
               }
           }          
          if(again == 1)
              break;
       }
      hour = date.get(Calendar.HOUR);
      o.display_order(hour,minute);
      re.display_rewards(o.calcPoints(in, a), r); //in=index of logedin user, a=array of user's account
    }
}