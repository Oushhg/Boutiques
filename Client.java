/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boutique;

/**
 *
 * @author Oussama
 */
public class Client {
    int id , cart ;
    String name ; 

    public Client(int id, int cart, String name) {
        this.id = id;
        this.cart = cart;
        this.name = name;
    }

   

    public int getId() {
        return id;
    }

    public int getCart() {
        return cart;
    }

    public String getName() {
        return name;
    }
}
