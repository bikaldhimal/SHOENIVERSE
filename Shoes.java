
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Shoes {

    private String brand; 
    private String model; 
    private int price; 
    private String color; 
    private String sex; 
    private int size;
    private int quantity;
    
    public Shoes(String brand, String model, int price, String color, String sex, int size, int quantity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.sex = sex;
        this.size = size;
        this.quantity = quantity;
    }

    public String getBrand() {
        return this.brand;
    }
    public String getModel() {
        return this.model;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }

    public String getSex() {
        return this.sex;
    }

    public int getSize() {
        return this.size;
    }

    public int getQuantity() {
        return this.quantity;
    }
}
