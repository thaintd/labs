
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ManageProgram {
    public static void main(String[] args) {
        String filename = "frames.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        
        menu.add("Add a frame");
        menu.add("Search a frame");
        menu.add("Update the price of a frame");
        menu.add("Remove a frame by ID");
        menu.add("Print the list");
        menu.add("Save the list to file");
        menu.add("Quit");
        int userChoice;
        boolean changed = false;
        FrameList list = new FrameList();
        list.AddFromFile(filename); //load initial data
        do {
            System.out.println("\nFrame Manager!");
            userChoice=menu.getUserChoice();
            switch(userChoice) {
                case 1: list.newFrame(); changed=true; break;
                case 2: list.searchFrame(); changed=true; break;
                case 3: list.updateFrame(); changed=true; break;
                case 4: list.removeFrame(); changed=true; break;
                case 5: list.printAll(); break;
                case 6: list.saveToFile(filename); changed=false;
                default : if (changed) {
                    System.out.println("Save changes Y/N? ");
                    String response = sc.nextLine().toUpperCase();
                    if (response.startsWith("Y"))
                        list.saveToFile(filename);
                }
            }
        }
        while (userChoice>0 && userChoice<7);
    }
}
