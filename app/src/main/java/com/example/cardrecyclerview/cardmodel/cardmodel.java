package com.example.cardrecyclerview.cardmodel;

public class cardmodel {
    String name;
    int image,number;

    public cardmodel(String name, int image, int number) {
        this.name = name;
        this.image = image;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
