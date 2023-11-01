package com.example.recyclerview;

public class Films {
    String name;
    String year;
    int img;


    public Films(String name, String year, int img) {
        this.name = name;
        this.year = year;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public int getImg() {
        return img;
    }
}
