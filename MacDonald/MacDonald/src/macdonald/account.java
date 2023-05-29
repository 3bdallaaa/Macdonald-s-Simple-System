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
//enum Gender{male,female};

public class account {
    
    String firstname,lastname,addres,email,mobile,password;
    int age, points,index=0;
    char sex;
//    gender sex;
    public account(String firstname, String lastname, String addres, String email, String mobile, String password, int age, int points, char sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.addres = addres;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.age = age;
        this.points = points;
        this.sex = sex;
    }
  
    public account() {
    }
        
        public int check_login(String e_mail, String pw, account[] users){
        
        boolean found = false;
        
        while(found == false){
            for(int i=0; i < users.length; i++){
                if(e_mail.equals(users[i].email)&& pw.equals(users[i].password)){
                    index = i; //points
                    found = true;
                    JOptionPane.showMessageDialog(null,"Succesfully Logged in.");   
                }   
            }
           if(found == false){
               JOptionPane.showMessageDialog(null, "Invalid E-mail or Password","Invalid", JOptionPane.WARNING_MESSAGE);
               e_mail = JOptionPane.showInputDialog( null , "E-mail:");
               pw = JOptionPane.showInputDialog(null,"Password");
               /*String message = "Please enter your e-mail name and password.";
                 String passFiled=" ",userFiled=" ";
                 int result = JOptionPane.showOptionDialog(null, new Object[] {message, userField, passField},
                 "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                 if (result == JOptionPane.OK_OPTION)
                System.out.println(userField.getText() + " " + new String(passField.getPassword()));
                System.exit(0);*///////////3ayz ashofha lesa bas msh mohema
           }
        }
        return index;
    }
    
    public void Register(account[] aa){
        
        JOptionPane.showMessageDialog(null,"Please Enter the following data:");
        
        aa[index].firstname = JOptionPane.showInputDialog( null , "First name:");
        
        aa[index].lastname= JOptionPane.showInputDialog( null , "Last name:");

        boolean char_check = false, mob_check = false, pw_check = false;
        
        String mobileNum = JOptionPane.showInputDialog( null , "Mobile Number:");

        while(mob_check == false){
            if(mobileNum.length() == 11 ){
                aa[index].mobile = mobileNum;
                mob_check = true;
            }
            if(mob_check == false){
                mobileNum = JOptionPane.showInputDialog( null , "Invalid Moblie number \n (it must contains 11 digits)");
            }
        }

        aa[index].age= Integer.parseInt(JOptionPane.showInputDialog( null , "Age:"));
        
        aa[index].addres= JOptionPane.showInputDialog( null , "Address:");

        
       while(char_check == false){
           char gender = JOptionPane.showInputDialog( null , "Gender:( m / f )").charAt(0);
           if(sex == 'm'|| sex == 'f'){
               aa[index].sex = sex;
               char_check = true;
           }
        }
        
        aa[index].email= JOptionPane.showInputDialog( null , "Email:");
        String Paw = JOptionPane.showInputDialog( null , "Password:");
        
        while(pw_check == false){
            if(Paw.length() >= 8 ){
                aa[index].password = Paw;
                pw_check = true;
            }
            if(pw_check == false){
                Paw = JOptionPane.showInputDialog( null , "Invalid Password\n (enter password containing 8 charachters) ");
            }
        }
        JOptionPane.showMessageDialog(null, """
                                                      Congratulations
                                             Your Account created Succesfully""");
    }
   public void display_info(String E, account[] a){
   }
}