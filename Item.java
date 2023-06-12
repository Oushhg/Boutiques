/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boutique;

/**
 *
 * @author Oussama
 */
public class Item {
    int id , quan , price ;
    String name , type, nameItem , Author ;

    public int getId() {
        return id;
    }

    public int getQuan() {
        return quan;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Item(int id, int quan, int price, String name, String type, String nameItem, String Author) {
        this.id = id;
        this.quan = quan;
        this.price = price;
        this.name = name;
        this.type = type;
        this.nameItem = nameItem;
        this.Author = Author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

  public void AddQuan(int Quan){
      this.quan+=Quan ;
  }
    
}
