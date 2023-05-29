/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macdonald;

/**
 *
 * @author Dell
 */
public abstract class menu {
    String name;
    double price,points;
    static int count = 0;
    String[] add_name = new String[10];
    double[] add_price = new double[10];
    double[] add_points= new double[10];
    //for display method
    String k,w="";
    int i=0, q,n=0;

    protected menu(String name, double price, double points) {
        this.name = name;
        this.price = price;
        this.points = points;
    }

    protected menu() {
    }
    public abstract int choose(menu[] m);
}