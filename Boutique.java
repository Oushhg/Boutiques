/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boutique;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Oussama
 */
public class Boutique {
 public static Item item[] = new Item[20];
 public static int size = 0 ;
 
 public static Client client[] = new Client[20];
 public static int size1 = 0 ;
 public static int cart[] = new int [10];
    /**
     *
     * @param args
     */
    public static void main(String[]args){
   
        for(int i = 0 ; i<cart.length ; i++){
        cart[i]= -1 ;
    }
       MainMenue();
   }
    public static void MainMenue(){
       
        while(true){
            
        String Menu = " Oussama Belkadi";
        String Num = JOptionPane.showInputDialog(null,Menu);
        int ch = Integer.parseInt(Num);
        switch (ch){
            case 1 -> AddItem();
            case 2 -> AddCustmer() ;
            
              case 3 -> {
         }
            
              case 4 -> {
         }
            
              case 5 -> {
         }
            
              case 6 -> {
         }
            
              case 7 -> {
         }
                
              case 8 -> System.exit(0);
               
        }
      }
    }
    private static void AddItem() {
        int nu = -1 ;
        do{
        JTextField id = new JTextField();
        JTextField name = new JTextField();
        JTextField quan = new JTextField();
        JTextField price = new JTextField();
        JTextField type = new JTextField();
        JTextField nameType = new JTextField();
        JTextField maja = new JTextField();
        
        Object [] Message = {"Enter Item Number" , id , "Enter item Name:" ,name , "Enter item quality:" ,quan, "Enter item Price:" ,price, "Enter the type of the book , shoes, game ", type };
        int YesOrNo = JOptionPane.showConfirmDialog(null, Message);
        Object [] Book = {"Enter Book Title", nameType,"Enter Book Author: ",maja };
        Object [] Shoes = {"Enter Game number", nameType,"Enter place of mane facture ",maja };
        Object [] Game = {"Enter iteam number", nameType,"Enter Book Author: ",maja };
        int Result1 = 1, Result2 = 1, Result3 = 1;
        if(type.getText().toUpperCase().equals("B")){
                     Result1 = JOptionPane.showConfirmDialog(null, Book);
        }
        if(type.getText().toUpperCase().equals("G")){
                     Result1 = JOptionPane.showConfirmDialog(null, Game);
        }
        if(type.getText().toUpperCase().equals("S")){
                     Result1 = JOptionPane.showConfirmDialog(null, Shoes);
        }
        
        if (YesOrNo == JOptionPane.YES_OPTION && Result1 == JOptionPane.YES_OPTION) {
            int ID = Integer.parseInt(id.getText());
            String Name = name.getText();
            String Type = type.getText();
            String NAMETYPE = nameType.getText();
            String Maja = maja.getText();
            
            int QUAN = Integer.parseInt(quan.getText());
            int PRICE = Integer.parseInt(price.getText());
            int index = searchIDITem(ID);
            int indexName = searchIDITem(Name);
            
            if(index !=-1){
                item[indexName].AddQuan(QUAN);
                JOptionPane.showMessageDialog(null,"Message " );
            }
            if(index ==-1){
                item[size] = new Item(ID,QUAN,PRICE,Name,Type,NAMETYPE,Maja);
                size++;
                JOptionPane.showConfirmDialog(null, "Reussie");
            }else{
                JOptionPane.showConfirmDialog(null, "Déja ");
            }
        }
        String Re = JOptionPane.showInputDialog(null, "name");
    }while(nu == 1);
        }
    private static int searchIDITem(int ID){
        for(int i=0; i>size ; i++){
            if(ID == item[i].getId()){
                return i ;
            }
            
        }
                return -1 ;
    
    }

    private static int searchIDITem(String Name) {
        for(int i=0; i>size ; i++){
            if(Name.equals(item[i].getName())){
                return i ;
            }
            
        }
                return -1 ;
    
    }

    private static void AddCustmer() {
        int nu = -1 ;
        do {
            JTextField id = new JTextField();
            JTextField name = new JTextField();
            Object message[] = {"Enter custmer number ",id , "Enter custmer NAME" , name};
            
            int YES = JOptionPane.showConfirmDialog(null, message);
            if(YES == JOptionPane.YES_OPTION ){
                int ID = Integer.parseInt(id.getText());
            int index = SearchCart(ID) ;
                if(index != -1){
                    client[size1]= new Client(ID, index+1 ,name.getText());
                    size1++ ;
                    JOptionPane.showMessageDialog(null, "Client Ajouté");
                }else{
                    JOptionPane.showConfirmDialog(null, "il n'ya pas une boule vide");
                }
            }
        }while(nu == 1);
    }

    private static int SearchCart(int id) {
                    for(int i = 0 ; i<cart.length ; i++){
                     if(cart[i]== -1) {
                         cart[i]= id ;
                         return i ;
                     }  
                    }
                    return 1 ;
    }
    }


    
    
    
