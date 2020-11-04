package com.gardify.groupielibrarysample;

public class Friends {
    String name;
    String email;
    int image;

    public Friends(){}

    public Friends(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getImage(){
        return image;
    }
}
