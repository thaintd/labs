/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author ntduy
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public Fraction mul (Fraction f) {

        Fraction re = new Fraction();

        re.num = this.num * f.num;

        re.denum = f.denum * this.denum;

        return re;

    }

    public Fraction div (Fraction f) {

        Fraction re = new Fraction();

        re.num = this.num * f.denum;

        re.denum = this.denum * f.num;

        return re;
