/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psx.source;

/**
 *
 * @author Pranav
 */
public class Student {
    // A simple POJO class for Student 
    private long id;
    private String name;
    private String address;
    
    
    // getters
    
    public long getId (){
        return id;
    }
    public String getAddress (){
        return address;
    }
    public String getName ()
    {
        return name;
    }
    
    // setters
    
   public void setId (long id){
       this.id = id;
   }
   
   public void setAddress (String address){
       this.address = address;
   }
   
   public void setName (String name){
       this.name = name;
   }
}
