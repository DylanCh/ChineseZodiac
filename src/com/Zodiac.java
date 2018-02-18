package com;

/**
 * Created by Hanjun Chen on 2/15/18.
 */
public class Zodiac{
    public String chineseName;
    public String name;

    public Zodiac(int year) {
        this.year = year;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int year;
}
