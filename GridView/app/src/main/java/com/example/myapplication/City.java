package com.example.myapplication;

public class City {
    private String Id;
    private String Name;
    private int IdImage;

    public City(String id, String name, int idImage) {
        Id = id;
        Name = name;
        IdImage = idImage;
    }

    public City(String name, int idImage) {
        Name = name;
        IdImage = idImage;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getIdImage() {
        return IdImage;
    }

    @Override
    public String toString() {
        return "City{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", IdImage=" + IdImage +
                '}';
    }

}
