/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Frame implements Comparable {
    private String code;
    private String make;
    private int length;
    private int width;
    private int price;

    public Frame() { super();
    }

    public Frame(String code, String make, int length, int width, int price) {
        this.code = code;
        this.make = make;
        this.length = length;
        this.width = width;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getMake() {
        return make;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    //Implement the Comparable interface for sorting operation
    @Override
    public int compareTo(Object emp) {
        return this.getCode().compareTo(((Frame)emp).getCode());
    }
    void print() {
        System.out.println(code+";"+make+";"+length+";"+width+";"+price); 
    }
}
