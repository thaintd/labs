/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
public class Menu extends Vector<String> {
    
    public Menu() { super(); this.add(""); 
    }
    
    void addMenuItem(String S) { this.add(S); }
    
    int getUserChoice() {
        for (int i=1; i < this.size(); i++) {
            System.out.println(i+". "+this.get(i));
        }
        Scanner sc = new Scanner(System.in);
        int choice;
        try {
            System.out.println("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
        }
        catch(NumberFormatException e) {
            System.out.println("Try again");
            return getUserChoice();
        }
        return choice;
    }  
}
