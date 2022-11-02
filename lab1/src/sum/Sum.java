/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sum;



/**
 *
 * @author ntduy
 */
public class Sum {
    public static void main(String[] args) {
        double sum = 0;
        for(int i=0; i<args.length; i++){             
             double d = Double.parseDouble(args[i]);
             sum = sum + d;
        }
        System.out.println("Sum: "+ sum  );
    }
}
        
    
    
    

