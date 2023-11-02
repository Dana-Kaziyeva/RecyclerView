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

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setImg(int img) {
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
