/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.util.*;
public class FrameList extends Vector<Frame> {
    
        Vector <String> storedCodes = new Vector <>();
        Scanner sc = new Scanner(System.in);
    public FrameList() { super(); }
    
    public void AddFromFile(String fName) {
        try {
            File f = new File(fName); //checking the file
            if (!f.exists()) return;
            FileReader fr = new FileReader(f); //read()
            BufferedReader bf = new BufferedReader(fr); //readLine()
            String details;
            while ((details=bf.readLine())!=null)
            {
                //Splitting details into elements
                StringTokenizer stk = new StringTokenizer(details,",");
                String code = stk.nextToken().toUpperCase();
                while(stk.hasMoreTokens()) {
                    
                    String make = stk.nextToken().toUpperCase();
                    int length = Integer.parseInt(stk.nextToken());
                    int width = Integer.parseInt(stk.nextToken());
                    int price = Integer.parseInt(stk.nextToken());
                    Frame fre = new Frame(code, make, length, width, price);
                    this.add(fre);
                } 
            }
            bf.close(); fr.close();
        }
        catch(IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
    public void saveToFile(String fName) {
        if(this.isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        try {
            File f = new File(fName);
            FileWriter fw = new FileWriter(f); //write()
            PrintWriter pw = new PrintWriter(fw); //println()
            this.forEach((Frame x) -> {
                pw.println(x.getCode()+";"+x.getMake()+";"+x.getLength()+";"+x.getWidth()+";"+x.getPrice());
            });
            pw.close(); fw.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
    private int find(String aCode) {
        //check the list if string Code inputted equals aCode in the list
        for(int i=0; i<this.size();i++)
            if(this.get(i).getCode().equals(aCode)) return i;
        return -1;
    }
    private boolean valid (String aCode){
        
        for  (int i =0;i<storedCodes.size();i++) 
            if (aCode.equals(storedCodes.get(i))) return false;
        
        for  (int i =0;i<this.size();i++) 
            if (aCode.equals(this.get(i).getCode())) return false;
        return true;
    }
    
    public void newFrame() {
        //insert your code here
        String newCode, newMake; 
        int length, width, price;
        boolean duplicated, matched;
        System.out.println("New Frame");
        do {
            System.out.println("  Code F0000: ");
            newCode = sc.nextLine().toUpperCase();
            duplicated = !valid(newCode);
            matched = newCode.matches("F\\d{4}$"); //Pattern: F and 4 digits
            if (duplicated) System.out.println("  The code is duplicated.");
            if (!matched) System.out.println("  The code: F and 4 digits.");
        }
        while (duplicated || (!matched));
        System.out.println("  Make: ");
        newMake = sc.nextLine().toUpperCase();
        System.out.println("  Length: ");
        length = Integer.parseInt(sc.nextLine());
        System.out.println("  Width: ");
        width = Integer.parseInt(sc.nextLine());
        System.out.println("  Price: ");
        price = Integer.parseInt(sc.nextLine());
        this.add(new Frame(newCode, newMake, length, width, price));
        System.out.println("New frame has been added");
    }
    
    public void searchFrame() {
        /*insert your code here
        
        When the operation 2 is chosen, user will enter the length and width. 
        The program will print out frames whose lengths are greater than inputted
        length and whose widths are greater than inputted width.
        */
        int length, width;
        System.out.println("Enter the length: ");
        length = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the width: ");
        width = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getLength() > length && this.get(i).getWidth() > width) {
                this.get(i).print();
            }
        }
    }
    
    public void updateFrame() {
        //insert your code here
        //update Frame by ID
        String code;
        System.out.println("Enter the code to update a frame: ");
        code = sc.nextLine().toUpperCase();
        int pos=find(code);
        if (pos<0) System.out.println("The code does not exist");
        else {
            int oldPrice = this.get(pos).getPrice();
            int newPrice;
            System.out.println("Old price: "+oldPrice+"  Price: ");
            newPrice = Integer.parseInt(sc.nextLine());
            this.get(pos).setPrice(newPrice);
            System.out.println("Updated");
        }
    }
    
    public void removeFrame() {
        //insert your code here
        //remove Frame by ID
        String code;
        System.out.println("Enter the code to remove a frame: ");
        code = sc.nextLine().toUpperCase();
        int pos=find(code);
        if (pos<0) System.out.println("The code does not exist.");
        else {
            this.remove(pos);
            System.out.println("\nFrame has been removed");
        }
    }
    
    public void printAll() {
            //hint: do a loop get all information of frame and print out
            this.forEach((aThi) -> {
                aThi.print();
            });
    }
}
