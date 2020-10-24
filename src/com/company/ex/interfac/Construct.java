package com.company.ex.interfac;

public class Construct {
    public static void main(String[] args) {

        //использовать конструкторы: название_класса::new

        //релизация интерфейса с помощь  конструктора User(String name)
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("tom");
        System.out.println(user.getName());

    }
}

 interface UserBuilder{
    User create(String name);
 }


 class User{
    private String name;

    //Constraction

     public User(String name) {
         this.name = name;
     }

     public String getName(){
        return name;
    }
 }