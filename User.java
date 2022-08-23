package javaapplication1;

import javax.swing.JTextField;

class User {

    private String title, type, name, phone;
    private int Price, page_Count, ISBN, pub_code;

    int Code;
    String email;
    String pass;
    String city;

    public int getCode() {
        return Code;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getCity() {
        return city;
    }

    public User(String name, int Code, String Phone) {
        this.name = name;
        this.ISBN = Code;
        this.phone = Phone;
    }

    public User(int Code, String email, String pass, String name, String phone, String city) {
        this.Code = Code;
        this.email = email;
        this.pass = pass;
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public User(String title, int ISBN, String type, int Price, int page_Count) {
        this.ISBN = ISBN;
        this.title = title;
        this.type = type;
        this.Price = Price;
        this.page_Count = page_Count;

    }

    public User(String name, String phone, int pub_code) {
        this.name = name;
        this.phone = phone;
        this.pub_code = pub_code;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPub_code() {
        return pub_code;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return Price;
    }

    public int getPage_Count() {
        return page_Count;
    }

}
